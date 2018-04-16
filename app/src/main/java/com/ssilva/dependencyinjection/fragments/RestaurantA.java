package com.ssilva.dependencyinjection.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

import com.ssilva.dependencyinjection.R;
import com.ssilva.dependencyinjection.dagger.CoffeeComponent;
import com.ssilva.dependencyinjection.dagger.DaggerCoffeeComponent;
import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.menu.coffe.CoffeeBrewer;
import com.ssilva.dependencyinjection.util.CoffeeHelper;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import timber.log.Timber;

public class RestaurantA extends BaseFragment {

   @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.btn_brew_coffee)
    Button btnBrewCoffee;

    //For coffee
    int waterQuantity = 10;
    Coffee.Flavor flavor;


    public RestaurantA() {

    }

    public static RestaurantA getInstance(Bundle params) {
        RestaurantA restaurantA = new RestaurantA();
        restaurantA.setArguments(params);
        return restaurantA;
    }

    @Override
    int getLayoutId() {
        return R.layout.restaurant_a;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Timber.d("onActivityCreated()");
        txtTitle.setText("Restaurant A");
        btnBrewCoffee.setText(getString(R.string.brew_coffee, "Espresso"));
        goDagger();
    }

    CoffeeHelper coffeHelper;
    // Method Injection, are we just injecting it in a different section
    @Inject
    public void setCoffeeMaker (CoffeeHelper coffeeHelper, Coffee.Flavor flavor) {
        // Middle ware ? naa, Here we can simply do what we want

        this.coffeHelper = coffeeHelper;
        this.flavor = flavor;
    }

    public CoffeeComponent coffeeComponent;
    private void goDagger() {
        coffeeComponent = DaggerCoffeeComponent.builder().build();
        coffeeComponent.provideCoffee(this);
    }

    private void withDagger() {
        CoffeeBrewer coffeeBrewer = coffeHelper.getCoffeeBrewer(waterQuantity, flavor);
        coffeeBrewer.brewCoffee();
    }

    @OnClick(R.id.btn_brew_coffee)
    public void brewCoffee() {
        withDagger();
    }

}
