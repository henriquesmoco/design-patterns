package com.github.henriquesmoco.design_patterns.abstract_factory;

import com.github.henriquesmoco.design_patterns.abstract_factory.cars.normal.NormalCarFactory;
import com.github.henriquesmoco.design_patterns.abstract_factory.cars.sport.SportCarFactory;

public class AbstractCarFactory {

    public CarFactory getCarFactory(CarType carType) {
        CarFactory factory = null;
        switch(carType) {
            case NORMAL:
                factory = new NormalCarFactory();
                break;
            case SPORT:
                factory = new SportCarFactory();
                break;
        }
        return factory;
    }

}
