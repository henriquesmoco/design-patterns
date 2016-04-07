package com.github.henriquesmoco.design_patterns.factory;

public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        Shape aShape = null;
        if (shapeType != null) {
            switch (shapeType) {
                case CIRCLE:
                    aShape = new Circle();
                    break;
                case SQUARE:
                    aShape = new Square();
                    break;
            }
        }
        return aShape;
    }
}
