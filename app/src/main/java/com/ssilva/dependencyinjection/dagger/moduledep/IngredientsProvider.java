package com.ssilva.dependencyinjection.dagger.moduledep;

import com.ssilva.dependencyinjection.menu.coffe.Coffee;

import dagger.Module;
import dagger.Provides;

@Module
public class IngredientsProvider {


    @Provides
    public int quantities() {
        return 10;
    }

    @Provides
    public Coffee.Flavor getFlavor() {
        return Coffee.Flavor.Latte;
    }

}
