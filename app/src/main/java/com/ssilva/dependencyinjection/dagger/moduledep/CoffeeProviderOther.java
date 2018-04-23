package com.ssilva.dependencyinjection.dagger.moduledep;

import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.util.CoffeeHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeProviderOther {

    @Provides
    public CoffeeHelper coffeeHelper(Coffee.Flavor flavor, int quantity) {
        return new CoffeeHelper(flavor, quantity);
    }
}
