package com.ssilva.dependencyinjection.dagger;

import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.util.CoffeeHelper;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

// We need to specify it's a module so dagger can look for it
@Module
public class CoffeeProvider {

    @Provides
    @Named("Small")
    public int smallQuantity() {
        return 10;
    }

    @Provides
    @Named("Medium")
    public int mediumQuantity() {
        return 20;
    }

    @Provides
    @Named("Large")
    public int largeQuantity() {
        return 30;
    }

    @Provides
    Coffee.Flavor getCoffeeFlavor() { return Coffee.Flavor.Espresso;}

    @Provides
    CoffeeHelper getCoffeeHelper(Coffee.Flavor flavor, @Named("Medium") int quantity) {
        return new CoffeeHelper(flavor, quantity);
    }

}
