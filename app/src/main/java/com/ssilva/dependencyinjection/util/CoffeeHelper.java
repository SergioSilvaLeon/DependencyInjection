package com.ssilva.dependencyinjection.util;


import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.menu.coffe.CoffeeBrewer;
import com.ssilva.dependencyinjection.menu.coffe.Water;

public class CoffeeHelper {

    public CoffeeHelper() {
    }

    public CoffeeBrewer getCoffeeBrewer(int waterQty,
                                        Coffee.Flavor flavor) {
        Water water = new Water(waterQty);
        Coffee coffee = new Coffee(flavor);
        return new CoffeeBrewer(water, coffee);
    }

}

