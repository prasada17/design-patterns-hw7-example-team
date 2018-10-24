package edu.ecu.cs.csci3030.shapes;

import edu.ecu.cs.csci3030.colors.Color;
import edu.ecu.cs.csci3030.surfaces.ISurface;

/**
 * A triangle shape
 *
 * @author Mark Hills
 * @version 1.0
 */
public class Triangle extends Shape {
    /**
     * Create a new triangle of the given color, with the given X and Y coordinates
     *
     * @param color the color of the circle
     * @param x the X coordinate of the circle
     * @param y the Y coordinate of the circle
     */
    public Triangle(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void drawShape(ISurface surface) {
        System.out.println("Drawing " + getColor().toString() +
                " triangle on " + surface.getSurfaceName() + " at coordinates (" +
                getX() + "," + getY() + ")");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            Triangle otherTriangle = (Triangle) obj;
            if (getColor().equals(otherTriangle.getColor())) {
                if (getX() == otherTriangle.getX() && getY() == otherTriangle.getY()) {
                    return true;
                }
            }
        }

        return false;
    }
}
