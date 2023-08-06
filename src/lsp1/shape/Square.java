package lsp1.shape;

import lsp1.Quadreliteral;

import java.awt.geom.QuadCurve2D;

public class Square implements Quadreliteral {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public double getSideA() {
        return side;
    }

    @Override
    public double getSideB() {
        return side;
    }
}
