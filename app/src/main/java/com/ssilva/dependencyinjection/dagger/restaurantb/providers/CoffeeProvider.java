package com.ssilva.dependencyinjection.dagger.restaurantb.providers;

import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.util.CoffeeHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeProvider {

    @Provides
    public CoffeeHelper getCoffeeHelper(Coffee.Flavor flavor) {
        return new CoffeeHelper(20, flavor);
    }
}
