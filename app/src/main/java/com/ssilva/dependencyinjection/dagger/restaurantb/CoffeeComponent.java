package com.ssilva.dependencyinjection.dagger.restaurantb;

import com.ssilva.dependencyinjection.dagger.restaurantb.providers.CoffeeProvider;
import com.ssilva.dependencyinjection.fragments.RestaurantB;

import dagger.Subcomponent;

@Subcomponent(modules = CoffeeProvider.class)
public interface CoffeeComponent {
    void provideCoffee(RestaurantB restaurantB);
}
