package com.ssilva.dependencyinjection.dagger.named;

import com.ssilva.dependencyinjection.HotelB;

import dagger.Component;

@Component(modules = CoffeeProvider.class)
public interface CoffeeComp {
    void injectCoffeeHelper(HotelB hotelB);
}
