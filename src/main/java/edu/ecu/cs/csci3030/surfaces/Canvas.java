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
    private static Canvas instance = new Canvas();

    public static Canvas getInstance() {
        return instance;
    }

    /**
     * The shapes contained on this Canvas
     */
    private List<Shape> shapes;

    /**
     * Create a new, empty Canvas
     */
    private Canvas() {
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
            notifyObservers();
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
    public Canvas removeShape(Shape shape) {
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


    /**
     * List to hold the observers that have attached to this subject.
     */
    private List<ICanvasObserver> observers = new LinkedList<>();

    /**
     * Attach a new observer to the canvas
     *
     * @param observer the observer to attach to this canvas
     */
    public void attach(ICanvasObserver observer) {
        observers.add(observer);
    }

    /**
     * Notify the observers that a change has occurred on the canvas
     */
    private void notifyObservers() {
        for (ICanvasObserver observer : observers) {
            observer.update();
        }
    }
}
