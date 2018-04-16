package com.ssilva.dependencyinjection.dagger.constructor;

import com.ssilva.dependencyinjection.menu.coffe.Coffee;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeProviderConstructor {

    @Provides
    public  int quantities() {
        return 10;
    }

    @Provides
    public Coffee.Flavor getFlavor() {
        return Coffee.Flavor.Americano;
    }
}
