package com.github.henriquesmoco.design_patterns.abstract_factory;

public interface CarFactory {

    CarEngine getEngine();

    CarBrakes getBrakes();
}
