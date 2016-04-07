package com.github.henriquesmoco.design_patterns.abstract_factory.cars.sport;

import com.github.henriquesmoco.design_patterns.abstract_factory.CarBrakes;

public class SportBrakes implements CarBrakes {

    public void brake() {
        System.out.println("Sport Brakes");
    }
}
