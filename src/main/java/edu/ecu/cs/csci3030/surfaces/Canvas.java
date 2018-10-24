package edu.ecu.cs.csci3030.surfaces;

import edu.ecu.cs.csci3030.shapes.Shape;

import java.util.LinkedList;
import java.util.List;


/**
 * Represents a canvas, which is a collection of shapes.
 *
 * @author Mark Hills
 * @version 1.0
 */
public class Canvas {
    // TODO: We should only have a single Canvas, so this should use the Singleton pattern.

    // What do we need to do to make Canvas a singleton? What changes need to
    // occur below and in other parts of the code?

    /**
     * The shapes contained on this Canvas
     */
    private List<Shape> shapes;

    /**
     * Create a new, empty Canvas
     */
    public Canvas() {
        shapes = new LinkedList<>();
    }

    /**
     * Add a new shape to the canvas, assuming it is not already on the canvas.
     *
     * @param shape the shape to add
     *
     * @return the current canvas, to allow method chaining
     */
    public Canvas addShape(Shape shape) {
        if (!shapes.contains(shape)) {
            shapes.add(shape);

            // TODO: Should we do anything else here?
        }
        return this;
    }

    /**
     * Remove a shape from the canvas, assuming it is already on the canvas.
     *
     * @param shape the shape to remove
     *
     * @return the current canvas, to allow method chaining
     */
    public void removeShape(Shape shape) {
        if (shapes.contains(shape)) {
            shapes.remove(shape);

            // TODO: Should we do anything else here?
        }
        return this;
    }

    /**
     * Check to see if the given shape is on the canvas
     *
     * @param shape the shape to check for
     *
     * @return true when the shape is on the canvas, false otherwise
     */
    public boolean containsShape(Shape shape) {
        // TODO: Should we do anything else here?
        return shapes.contains(shape);
    }

    // TODO: This will be the subject in the Observer pattern.

    // What do we need to add here to allow changes in this class to be
    // observed by the observers we will register?
}
