package com.ssilva.dependencyinjection.dagger.hotelb.providers;

import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.menu.coffe.Water;

import dagger.Module;
import dagger.Provides;

@Module
public class IngredientsProvider {
    @Provides
    public Coffee.Flavor getFlavor() {
        return Coffee.Flavor.Americano;
    }

    @Provides
    public Water getWater() {
        return new Water(20);
    }
}

