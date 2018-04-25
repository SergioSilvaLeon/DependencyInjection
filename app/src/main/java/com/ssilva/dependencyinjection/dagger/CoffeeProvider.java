package com.ssilva.dependencyinjection.dagger;

import com.ssilva.dependencyinjection.util.CoffeeHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeProvider {
    @Singleton
    @Provides
    CoffeeHelper getCoffeeHelper() {
        return new CoffeeHelper();
    }
}
