package com.ssilva.dependencyinjection.util;


import com.ssilva.dependencyinjection.menu.coffe.Coffee;
import com.ssilva.dependencyinjection.menu.coffe.CoffeeBrewer;
import com.ssilva.dependencyinjection.menu.coffe.Water;

public class CoffeeHelper {

    private int waterQuantity;
    private Coffee.Flavor flavor;

    public CoffeeHelper(int waterQuantity, Coffee.Flavor flavor) {
        this.waterQuantity = waterQuantity;
        this.flavor = flavor;
    }


    public CoffeeBrewer getCoffeeBrewer() {
        Water water = new Water(waterQuantity);
        Coffee coffee = new Coffee(flavor);
        return new CoffeeBrewer(water, coffee);
    }

    //---------------------

    public CoffeeHelper() {
    }

    public CoffeeBrewer getCoffeeBrewer(int waterQty,
                                        Coffee.Flavor flavor) {
        Water water = new Water(waterQty);
        Coffee coffee = new Coffee(flavor);
        return new CoffeeBrewer(water, coffee);
    }


}

