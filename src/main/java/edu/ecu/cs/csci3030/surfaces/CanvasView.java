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
public class CanvasView implements ISurface, ICanvasObserver {
    @Override
    public String getSurfaceName() {
        return "Canvas View";
    }

    @Override
    public void update() {
        System.out.println("Something changed in the Canvas");
    }
}
