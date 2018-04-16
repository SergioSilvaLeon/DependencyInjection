package com.ssilva.dependencyinjection.dagger.constructor;

import com.ssilva.dependencyinjection.HotelB;

import dagger.Component;

@Component(modules = {CoffeeProviderConstructor.class})
public interface CoffeeComp {
    void injectCoffeeHelper(HotelB hotelB);
}
