package lsp1.view;

import lsp1.Quadreliteral;


public class ShapeView {
    private final Quadreliteral quadreliteral;

    public ShapeView(Quadreliteral quadreliteral) {
        this.quadreliteral = quadreliteral;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(quadreliteral.getArea());
    }
}
