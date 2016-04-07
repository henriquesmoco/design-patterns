package com.github.henriquesmoco.design_patterns.factory;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

public class ShapeFactoryTest {
    private ShapeFactory shapeFactory;

    @Before
    public void setUp() throws Exception {
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void getShape_WithoutShape_returnNull() throws Exception {
        Shape shape = shapeFactory.getShape(null);

        assertThat(shape, is(nullValue()));
    }

    @Test
    public void getShape_Circle_returnShapeCircle() throws Exception {
        Shape shape = shapeFactory.getShape(ShapeType.CIRCLE);

        assertThat(shape, is(instanceOf(Circle.class)));
    }
}
