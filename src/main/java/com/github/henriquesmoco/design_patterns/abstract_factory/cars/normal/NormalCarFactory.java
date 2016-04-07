package com.github.henriquesmoco.design_patterns.abstract_factory.cars.normal;

import com.github.henriquesmoco.design_patterns.abstract_factory.CarBrakes;
import com.github.henriquesmoco.design_patterns.abstract_factory.CarEngine;
import com.github.henriquesmoco.design_patterns.abstract_factory.CarFactory;

public class NormalCarFactory implements CarFactory {

    public CarEngine getEngine() {
        return new NormalEngine();
    }

    public CarBrakes getBrakes() {
        return new NormalBrakes();
    }
}
