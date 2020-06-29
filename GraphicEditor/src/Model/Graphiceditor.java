package Model;

import Interface.IShape;

public class Graphiceditor {
    public void DrawShape(IShape shape) {
        System.out.println(shape.Drow());
    }
}
