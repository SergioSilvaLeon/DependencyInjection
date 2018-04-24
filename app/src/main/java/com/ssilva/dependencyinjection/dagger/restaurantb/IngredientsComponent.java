package com.ssilva.dependencyinjection.dagger.restaurantb;

import com.ssilva.dependencyinjection.dagger.restaurantb.providers.IngredientsProvider;

import dagger.Component;

@Component(modules = IngredientsProvider.class)
public interface IngredientsComponent {
    CoffeeComponent provideCoffeeComponent();
}
