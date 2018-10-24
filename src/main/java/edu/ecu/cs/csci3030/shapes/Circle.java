package edu.ecu.cs.csci3030.shapes;

import edu.ecu.cs.csci3030.colors.Color;
import edu.ecu.cs.csci3030.surfaces.ISurface;

/**
 * A circle shape
 *
 * @author Mark Hills
 * @version 1.0
 */
public class Circle extends Shape {
    /**
     * Create a new circle of the given color, with the given X and Y coordinates
     *
     * @param color the color of the circle
     * @param x the X coordinate of the circle
     * @param y the Y coordinate of the circle
     */
    public Circle(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void drawShape(ISurface surface) {
        System.out.println("Drawing " + getColor().toString() +
                " circle on " + surface.getSurfaceName() + "at coordinates (" +
                getX() + "," + getY() + ")");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle otherCircle = (Circle) obj;
            if (getColor().equals(otherCircle.getColor())) {
                if (getX() == otherCircle.getX() && getY() == otherCircle.getY()) {
                    return true;
                }
            }
        }

        return false;
    }
}
