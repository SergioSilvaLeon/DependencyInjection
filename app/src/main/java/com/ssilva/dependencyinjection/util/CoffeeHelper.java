package com.ssilva.dependencyinjection.util;


import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.menu.coffe.CoffeeBrewer;
import com.ssilva.dependencyinjection.menu.coffe.Water;

import javax.inject.Inject;

public class CoffeeHelper {

    public CoffeeHelper() {
    }

    public CoffeeBrewer getCoffeeBrewer(int waterQty,
                                        Coffee.Flavor flavor) {
        Water water = new Water(waterQty);
        Coffee coffee = new Coffee(flavor);
        return new CoffeeBrewer(water, coffee);
    }

    // -------------------------------------------------------------
    int waterQty;
    Coffee.Flavor flavor;


    @Inject
    public CoffeeHelper(Coffee.Flavor flavor, int waterQty) {
        this.flavor = flavor;
        this.waterQty = waterQty;
    }

}

