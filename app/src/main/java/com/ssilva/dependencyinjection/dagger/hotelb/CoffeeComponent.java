package com.ssilva.dependencyinjection.dagger.hotelb;

import com.ssilva.dependencyinjection.HotelB;
import com.ssilva.dependencyinjection.dagger.hotelb.providers.CoffeeProvider;

import dagger.Component;

@Component(modules = {CoffeeProvider.class}, dependencies = {IngredientsComponent.class})
public interface CoffeeComponent {
    void provideCoffee(HotelB hotelB);
}
