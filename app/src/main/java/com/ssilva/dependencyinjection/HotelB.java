package com.ssilva.dependencyinjection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.ssilva.dependencyinjection.dagger.CoffeeComponent;
import com.ssilva.dependencyinjection.dagger.DaggerCoffeeComponent;
import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.menu.coffe.CoffeeBrewer;
import com.ssilva.dependencyinjection.menu.coffe.Water;
import com.ssilva.dependencyinjection.util.CoffeeHelper;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HotelB extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.btn_brew_coffee)
    Button btnBrewCoffee;

    //For coffee
    int waterQuantity =10;
    Coffee.Flavor flavor;
    CoffeeHelper coffeeHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_b);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Hotel B");
        txtTitle.setText("Hotel B");
        btnBrewCoffee.setText(getString(R.string.brew_coffee, "Americano"));
        goDagger();
    }

    CoffeeComponent coffeeComponent;
    private void goDagger() {
        coffeeComponent = DaggerCoffeeComponent.builder().build();
        coffeeComponent.provideCoffee(this);
    }

    private void withDagger() {
    CoffeeBrewer coffeeBrewer = coffeeHelper.getCoffeeBrewer(waterQuantity, flavor);
        coffeeBrewer.brewCoffee();
    }

    @Inject
    public void setCoffeeHelper (CoffeeHelper coffeeHelper, Coffee.Flavor flavor) {
        this.coffeeHelper = coffeeHelper;
        this.flavor = flavor;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return true;
    }

    @OnClick(R.id.btn_brew_coffee)
    public void brewCoffee() {
        withDagger();
    }


}
