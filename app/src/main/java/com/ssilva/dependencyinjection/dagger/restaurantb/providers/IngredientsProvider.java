package com.ssilva.dependencyinjection.dagger.restaurantb.providers;


import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.menu.coffe.Water;

import dagger.Module;
import dagger.Provides;

@Module
public class IngredientsProvider {

    @Provides
    public Coffee.Flavor getFlavor(){
        return Coffee.Flavor.Latte;
    }

    @Provides
    public Water getWater(){
        return new Water(20);
    }
}
