package graphiceditor;

import Model.Circle;
import Model.Graphiceditor;
import Model.Rectangle;
import Model.Square;

public class GraphicEditor {

    public static void main(String[] args) {
        // TODO code application logic here
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();
        Square square = new Square();
        
        Graphiceditor editor = new Graphiceditor();
        
        editor.DrawShape(circle);
        editor.DrawShape(rect);
        editor.DrawShape(square);
    }
    
}
