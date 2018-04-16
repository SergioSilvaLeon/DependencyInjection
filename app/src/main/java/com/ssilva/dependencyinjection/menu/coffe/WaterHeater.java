package com.ssilva.dependencyinjection.menu.coffe;

import timber.log.Timber;

/**
*The water heater is depended on water,  and is concerned
*with boiling the water.
**/

public class WaterHeater {
    Water mWater;

    public WaterHeater(Water water) {
        mWater = water;
    }

    public void on() {
        Timber.d("Heater is on. Water is boiling");
        mWater.heat();
    }

    public void off() {
        Timber.d("Heater is off, Water is boiled");
    }

}
