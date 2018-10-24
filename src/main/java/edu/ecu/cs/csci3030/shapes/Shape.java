package edu.ecu.cs.csci3030.shapes;

import edu.ecu.cs.csci3030.colors.Color;
import edu.ecu.cs.csci3030.surfaces.ISurface;

/**
 * A shape in the drawing system.
 *
 * @author Mark Hills
 * @version 1.0
 */
public abstract class Shape {
    /**
     * The color of the shape
     */
    private Color shapeColor;

    /**
     * The x coordinate of the shape
     */
    private int xCoordinate;

    /**
     * The y coordinate of the shape
     */
    private int yCoordinate;

    /**
     * Create a new shape of the given color, with the given X and Y coordinates
     *
     * @param color the color of the shape
     * @param x the X coordinate of the shape
     * @param y the Y coordinate of the shape
     */
    public Shape(Color color, int x, int y) {
        shapeColor = color;
        xCoordinate = x;
        yCoordinate = y;
    }

    /**
     * Get the color of the shape
     *
     * @return the color of the shape
     */
    public Color getColor() {
        return shapeColor;
    }

    /**
     * Get the X coordinate
     *
     * @return the X coordinate
     */
    public int getX() {
        return xCoordinate;
    }

    /**
     * Get the Y coordinate
     *
     * @return the Y coordinate
     */
    public int getY() {
        return yCoordinate;
    }

    /**
     * Draw the current shape on the given surface
     *
     * @param surface the surfaceto draw upon
     */
    public abstract void drawShape(ISurface surface);
}