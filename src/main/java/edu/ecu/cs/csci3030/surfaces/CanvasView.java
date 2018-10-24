package edu.ecu.cs.csci3030.surfaces;

/**
 * A view onto a canvas.
 *
 * This represents a view onto the canvas. It could be the entire canvas,
 * but could also just focus on a specific part. This would be equivalent
 * to a window or tab that is focused on part of the canvas, and could
 * zoom in and/or zoom out.
 *
 * @author Mark Hills
 * @version 1.0
 */
public class CanvasView implements ISurface {
    @Override
    public String getSurfaceName() {
        return "Canvas View";
    }

    // TODO: We want to turn this class into an Observer, based on the Observer pattern, of changes in the Canvas.

    // You should modify this class to allow this. The update method does not
    // need to do anything useful at this point, it should just print a message
    // saying something has changed. Remember, ShapeList is also an Observer,
    // and in theory we could add even more, so the solution cannot be too
    // specific to just this one class!

}
