package com.ssilva.dependencyinjection.dagger;

import com.ssilva.dependencyinjection.HotelB;
import com.ssilva.dependencyinjection.fragments.RestaurantA;
import com.ssilva.dependencyinjection.fragments.RestaurantB;

import javax.inject.Singleton;

import dagger.Component;

@Singleton // TODO: Check what happens when I remove the @Singleton Scope in this Component
@Component(modules = {CoffeeProvider.class})
public interface CoffeeComponent {
    void provideCoffee(RestaurantA restaurantA);
    void provideCoffee(RestaurantB restaurantB);
    void provideCoffee(HotelB hotelB);
}
