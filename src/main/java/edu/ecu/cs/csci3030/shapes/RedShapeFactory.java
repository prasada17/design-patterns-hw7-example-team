package edu.ecu.cs.csci3030.shapes;

import edu.ecu.cs.csci3030.colors.Color;

public class RedShapeFactory extends ShapeFactory {
    protected RedShapeFactory() {
        // Do nothing
    }

    public Circle getCircle(int x, int y) {
        return new Circle(Color.RED, x, y);
    }

    public Square getSquare(int x, int y) {
        return new Square(Color.RED, x, y);
    }

    public Triangle getTriangle(int x, int y) {
        return new Triangle(Color.RED, x, y);
    }

}
