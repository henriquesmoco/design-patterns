package com.github.henriquesmoco.design_patterns.abstract_factory.cars.sport;


import com.github.henriquesmoco.design_patterns.abstract_factory.CarEngine;

public class SportEngine implements CarEngine {

    public void start() {
        System.out.println("Sport Engine Started");
    }

    public int getHorsePower() {
        return 260;
    }
}
