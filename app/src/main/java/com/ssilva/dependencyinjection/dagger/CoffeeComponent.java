package com.ssilva.dependencyinjection.dagger;

import com.ssilva.dependencyinjection.fragments.RestaurantA;

import dagger.Component;

@Component(modules = {CoffeeProvider.class})
public interface CoffeeComponent {
    void provideCoffee(RestaurantA restaurantA);
}
