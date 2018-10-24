package edu.ecu.cs.csci3030.surfaces;

/**
 * A listing of the shapes on a canvas.
 *
 * This represents a list of the shapes present on a canvas. It displays
 * the list, with shapes included as thumbnails with their current colors,
 * but does not show relative positions.
 *
 * @author Mark Hills
 * @version 1.0
 */
public class ShapeList implements ISurface {
    @Override
    public String getSurfaceName() {
        return "Shape List";
    }

    // TODO: We want to turn this class into an Observer, based on the Observer pattern, of changes in the Canvas.

    // You should modify this class to allow this. The update method does not
    // need to do anything useful at this point, it should just print a message
    // saying something has changed. Remember, CanvasView is also an Observer,
    // and in theory we could add even more, so the solution cannot be too
    // specific to just this one class!

}
