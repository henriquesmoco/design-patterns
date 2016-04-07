package com.github.henriquesmoco.design_patterns.abstract_factory.cars.sport;

import com.github.henriquesmoco.design_patterns.abstract_factory.CarBrakes;
import com.github.henriquesmoco.design_patterns.abstract_factory.CarEngine;
import com.github.henriquesmoco.design_patterns.abstract_factory.CarFactory;

public class SportCarFactory implements CarFactory {

    public CarEngine getEngine() {
        return new SportEngine();
    }

    public CarBrakes getBrakes() {
        return new SportBrakes();
    }
}
