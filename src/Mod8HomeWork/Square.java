package Mod8HomeWork;

import java.awt.*;

import static Mod8HomeWork.ShapeName.SQUARE;

public class Square extends ShapeWithFourAngles {
    private Color color = Color.YELLOW;

    public Square(Point pointA, Point pointB){
        this.pointA = pointA;
        this.pointB = pointB;
    }
    @Override
    public String printName() {
        return SQUARE.name();
    }

    @Override
    public void setColor(Color color) {
        this.color= color;
    }

    @Override
    public float calcSquare() {
        return (float)Math.pow(calcSideLength(pointA, pointB),2);
    }
}
