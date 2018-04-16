package com.ssilva.dependencyinjection.dagger;

import com.ssilva.dependencyinjection.util.CoffeeHelper;

import dagger.Module;
import dagger.Provides;

// We need to specify it's a module so dagger can look for it
@Module
public class CoffeeProvider {

    // This tells dagger that it's going to instantiate
    // a CoffeeHelper, so we can later on inject it.
    @Provides // We're calling a CoffeHelper, when we need a CoffeeHelper!
    CoffeeHelper getCoffeeHelper() {
        return new CoffeeHelper();
    }
    // We're telling dagger that it can find a CoffeeHelper.
    // Dagger will know to look inside its modules, provides
    // Annotation.

}
