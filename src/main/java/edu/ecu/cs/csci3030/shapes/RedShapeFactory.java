package edu.ecu.cs.csci3030.shapes;

import edu.ecu.cs.csci3030.colors.Color;

public class RedShapeFactory {
    public static Circle getCircle(int x, int y) {
        return new Circle(Color.RED, x, y);
    }

    public static Square getSquare(int x, int y) {
        return new Square(Color.RED, x, y);
    }

    public static Triangle getTriangle(int x, int y) {
        return new Triangle(Color.RED, x, y);
    }
}
