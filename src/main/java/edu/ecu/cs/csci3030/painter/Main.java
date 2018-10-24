package edu.ecu.cs.csci3030.painter;

import edu.ecu.cs.csci3030.colors.Color;
import edu.ecu.cs.csci3030.shapes.Circle;
import edu.ecu.cs.csci3030.shapes.Shape;
import edu.ecu.cs.csci3030.shapes.Square;
import edu.ecu.cs.csci3030.shapes.Triangle;
import edu.ecu.cs.csci3030.surfaces.Canvas;
import edu.ecu.cs.csci3030.surfaces.CanvasView;
import edu.ecu.cs.csci3030.surfaces.ShapeList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        // TODO: How do we adapt this code for a Singleton?
        // Create a new canvas to add shapes to
        Canvas canvas = new Canvas();

        // TODO: How do we change this to use an Abstract Factory?
        // Create the shapes to add and add them to the canvas
        Circle firstCircle = new Circle(Color.BLUE, 5, 10);
        Circle secondCircle = new Circle(Color.RED, 15, 21);
        Square firstSquare = new Square(Color.RED, 99, 125);
        Triangle firstTriangle = new Triangle(Color.BLUE, 53, 97);
        canvas.addShape(firstCircle).addShape(secondCircle).addShape(firstSquare).addShape(firstTriangle);

        // Put them into a list -- this is just a convenience for the code below
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(firstCircle); myShapes.add(secondCircle);
        myShapes.add(firstSquare); myShapes.add(firstTriangle);

        // TODO: What should happen when we have an Observer? Is this still needed?
        // Draw the shapes -- this would normally be triggered automatically,
        // but we do it here to make sure it is working.
        CanvasView canvasView = new CanvasView();
        ShapeList shapeList = new ShapeList();
        for (Shape s : myShapes) {
            s.drawShape(canvasView);
            s.drawShape(shapeList);
        }

    }
}
