package edu.ecu.cs.csci3030.shapes;

public abstract class ShapeFactory {
    public abstract Circle getCircle(int x, int y);

    public abstract Square getSquare(int x, int y);

    public abstract Triangle getTriangle(int x, int y);

    public static ShapeFactory getRedShapeFactory() {
        return new RedShapeFactory();
    }

    public static ShapeFactory getBlueShapeFactory() {
        // TODO: What should be returned here?
        return null;
    }

}
