package com.ssilva.dependencyinjection.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.TextView;

import com.ssilva.dependencyinjection.R;

import butterknife.BindView;
import butterknife.OnClick;
import timber.log.Timber;


public class RestaurantB extends BaseFragment {
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.btn_brew_coffee)
    Button btnBrewCoffee;

    // TODO:


    public RestaurantB() {

    }

    public static RestaurantB getInstance(Bundle params) {
        RestaurantB restaurantB = new RestaurantB();
        restaurantB.setArguments(params);
        return restaurantB;
    }

    @Override
    int getLayoutId() {
        return R.layout.restaurant_b;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Timber.d("onActivityCreated()");
        txtTitle.setText("Restaurant B");
        btnBrewCoffee.setText(getString(R.string.brew_coffee, "Latte"));


    }

    @OnClick(R.id.btn_brew_coffee)
    public void brewCoffee() {

    }
}