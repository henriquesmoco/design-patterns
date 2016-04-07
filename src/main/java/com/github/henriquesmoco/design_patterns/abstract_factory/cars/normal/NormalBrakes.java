package com.github.henriquesmoco.design_patterns.abstract_factory.cars.normal;

import com.github.henriquesmoco.design_patterns.abstract_factory.CarBrakes;

public class NormalBrakes implements CarBrakes {

    public void brake() {
        System.out.println("Normal Brakes");
    }
}
