package com.github.henriquesmoco.design_patterns.abstract_factory;

import com.github.henriquesmoco.design_patterns.abstract_factory.cars.normal.NormalBrakes;
import com.github.henriquesmoco.design_patterns.abstract_factory.cars.normal.NormalEngine;
import com.github.henriquesmoco.design_patterns.abstract_factory.cars.sport.SportBrakes;
import com.github.henriquesmoco.design_patterns.abstract_factory.cars.sport.SportEngine;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AbstractCarFactoryTest {
    private AbstractCarFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new AbstractCarFactory();
    }

    @Test
    public void create_NormalCar_OnlyUseNormalParts() throws Exception {
        CarFactory carFactory = factory.getCarFactory(CarType.NORMAL);
        CarEngine engine = carFactory.getEngine();
        CarBrakes brakes = carFactory.getBrakes();

        assertThat(engine, is(instanceOf(NormalEngine.class)));
        assertThat(brakes, is(instanceOf(NormalBrakes.class)));
    }

    @Test
    public void create_SportCar_OnlyUseSportParts() throws Exception {
        CarFactory carFactory = factory.getCarFactory(CarType.SPORT);
        CarEngine engine = carFactory.getEngine();
        CarBrakes brakes = carFactory.getBrakes();

        assertThat(engine, is(instanceOf(SportEngine.class)));
        assertThat(brakes, is(instanceOf(SportBrakes.class)));
    }
}
