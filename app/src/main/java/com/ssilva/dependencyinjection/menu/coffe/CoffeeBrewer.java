package com.ssilva.dependencyinjection.menu.coffe;

import timber.log.Timber;

public class CoffeeBrewer {
    /**
     * Coffee Bewer depends on water, coffe, and a heater
     * **/
    private Water mWater;
    private Coffee mCoffee;
    private WaterHeater mWaterHeater;


    public CoffeeBrewer(Water water, Coffee coffee) {
        mWater = water;
        mCoffee = coffee;
        mWaterHeater = new WaterHeater(water);
    }

    public void brewCoffee() {
        mWaterHeater.on();
        mWaterHeater.off();
        Timber.d("Brewing %s coffe with %s flavor",
                mWater.isWaterHot() ? "hot" : "cold",
                mCoffee.getFlavor());
        Timber.d("---------------- Coffee is ready to be" +
                "served ---------------");
    }


}
