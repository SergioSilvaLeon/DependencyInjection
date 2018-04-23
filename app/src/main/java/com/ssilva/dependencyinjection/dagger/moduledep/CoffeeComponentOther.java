package com.ssilva.dependencyinjection.dagger.moduledep;

import com.ssilva.dependencyinjection.fragments.RestaurantB;

import dagger.Component;


// For CoffeProviderOther to work, it requires (water, coffee) to work
// We'll use Ingredientes provider for it to work properly since it can be provided to us

@Component(modules = {CoffeeProviderOther.class, IngredientsProvider.class})
public interface CoffeeComponentOther {
    void provideCoffee(RestaurantB restaurantB);
}
