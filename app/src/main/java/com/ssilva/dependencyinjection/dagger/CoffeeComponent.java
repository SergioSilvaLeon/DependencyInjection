package com.ssilva.dependencyinjection.dagger;

import com.ssilva.dependencyinjection.HotelB;
import com.ssilva.dependencyinjection.fragments.RestaurantA;
import com.ssilva.dependencyinjection.fragments.RestaurantB;

import dagger.Component;

@Component(modules = {CoffeeProvider.class})
public interface CoffeeComponent {
    void provideCoffee(RestaurantA restaurantA);
}
