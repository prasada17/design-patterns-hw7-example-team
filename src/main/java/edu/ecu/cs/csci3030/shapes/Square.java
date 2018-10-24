package edu.ecu.cs.csci3030.shapes;

import edu.ecu.cs.csci3030.colors.Color;
import edu.ecu.cs.csci3030.surfaces.ISurface;

/**
 * A square shape
 *
 * @author Mark Hills
 * @version 1.0
 */
public class Square extends Shape {
    /**
     * Create a new square of the given color, with the given X and Y coordinates
     *
     * @param color the color of the circle
     * @param x the X coordinate of the circle
     * @param y the Y coordinate of the circle
     */
    public Square(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void drawShape(ISurface surface) {
        System.out.println("Drawing " + getColor().toString() +
                " square on " + surface.getSurfaceName() + "at coordinates (" +
                getX() + "," + getY() + ")");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square otherSquare = (Square) obj;
            if (getColor().equals(otherSquare.getColor())) {
                if (getX() == otherSquare.getX() && getY() == otherSquare.getY()) {
                    return true;
                }
            }
        }

        return false;
    }
}
