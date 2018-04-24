package com.ssilva.dependencyinjection.dagger.hotelb;

import com.ssilva.dependencyinjection.dagger.hotelb.providers.IngredientsProvider;
import com.ssilva.dependencyinjection.menu.coffe.Coffee;

import dagger.Component;

@Component(modules = {IngredientsProvider.class})
public interface IngredientsComponent {
    Coffee.Flavor giveFlavor();
}
