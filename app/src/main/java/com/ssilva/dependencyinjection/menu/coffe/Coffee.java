package com.ssilva.dependencyinjection.menu.coffe;

import timber.log.Timber;
/**
 * Coffee class is concerned with setting and getting an coffe
 * flavor
 * */
public class Coffee {

    public enum Flavor {
        Latte, Americano, Espresso
    }

    public Flavor mFlavor = Flavor.Espresso;

    public Coffee(Flavor flavor) {
        mFlavor = flavor;
        Timber.d("Getting coffe with flavor = %s",
                getFlavor());
    }

    public String getFlavor() {
        switch (mFlavor) {
            case Latte:
                return "Latte";
            case Espresso:
                return "Espresso";
            case Americano:
                return "Americano";

            default:
                return "Espresso";
        }
    }


}
