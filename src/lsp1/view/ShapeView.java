package lsp1.view;

import lsp1.shape.Quadrilateral;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadrilateral ql;

    public ShapeView(Quadrilateral ql) {
        this.ql = ql;
    }

    public void showArea() {
        System.out.print("Area of shape equal: ");
        System.out.println(ql.getArea());
    }
}
