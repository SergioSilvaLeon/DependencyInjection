package com.ssilva.dependencyinjection.dagger.named;

import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.util.CoffeeHelper;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeProvider {

    @Provides @Named("Small")
    public int smallQuantity() {
        return 10;
    }


    @Provides @Named("Medium")
    public int mediumQuantity() {
        return 20;
    }


    @Provides @Named("Large")
    public int LargeQuantity() {
        return 30;
    }

    @Provides
    Coffee.Flavor getCoffeeFlavor() { return Coffee.Flavor.Americano;}

    @Provides
    CoffeeHelper getCoffeeHelper() {
        return new CoffeeHelper();
    }

}
