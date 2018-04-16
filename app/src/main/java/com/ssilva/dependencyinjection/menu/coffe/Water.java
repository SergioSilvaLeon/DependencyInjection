package com.ssilva.dependencyinjection.menu.coffe;
/**
 * Water Class is concerned with setting the state of the qty
 * of water and determining if the water is hot
 * */
public class Water {
    public int quantity;
    private boolean isHeated = false;

    public Water(int quantity) {
        this.quantity = quantity;
    }

    public void heat() {
        isHeated = true;
    }

    public boolean isWaterHot() {
        return isHeated;
    }


}
