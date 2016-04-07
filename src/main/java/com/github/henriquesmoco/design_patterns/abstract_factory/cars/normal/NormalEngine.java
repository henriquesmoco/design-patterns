package com.github.henriquesmoco.design_patterns.abstract_factory.cars.normal;

import com.github.henriquesmoco.design_patterns.abstract_factory.CarEngine;

public class NormalEngine implements CarEngine {

    public void start() {
        System.out.println("Normal Engine Started");
    }

    public int getHorsePower() {
        return 180;
    }
}
