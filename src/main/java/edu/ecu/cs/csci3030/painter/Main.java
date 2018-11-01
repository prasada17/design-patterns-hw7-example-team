package edu.ecu.cs.csci3030.painter;

import edu.ecu.cs.csci3030.colors.Color;
import edu.ecu.cs.csci3030.shapes.*;
import edu.ecu.cs.csci3030.surfaces.Canvas;
import edu.ecu.cs.csci3030.surfaces.CanvasView;
import edu.ecu.cs.csci3030.surfaces.ShapeList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        // Create a new canvas to add shapes to
        Canvas canvas = Canvas.getInstance();

        ShapeFactory rsf = ShapeFactory.getRedShapeFactory();

        // Create the shapes to add and add them to the canvas
        Circle firstCircle = rsf.getCircle(5, 10);
        Circle redCircle = rsf.getCircle(15, 21);
        Square redSquare = rsf.getSquare(99, 125);
        Triangle firstTriangle = rsf.getTriangle(53, 97);
        Triangle redTriangle = rsf.getTriangle(28, 52);
        // Put them into a list -- this is just a convenience for the code below
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(firstCircle); myShapes.add(redCircle);
        myShapes.add(redSquare); myShapes.add(firstTriangle);

        CanvasView canvasView = new CanvasView();
        canvas.attach(canvasView);

        canvas.addShape(firstCircle).addShape(redCircle).addShape(redSquare).addShape(firstTriangle);

        ShapeList shapeList = new ShapeList();

        // Draw the shapes -- this would normally be triggered automatically,
        // but we do it here to make sure it is working.
        for (Shape s : myShapes) {
            s.drawShape(canvasView);
            s.drawShape(shapeList);
        }

    }
}
