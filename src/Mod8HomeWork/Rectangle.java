package Mod8HomeWork;

import java.awt.*;

import static Mod8HomeWork.ShapeName.RECTANGLE;

public class Rectangle extends ShapeWithFourAngles{
    private Color color = Color.YELLOW;
    public Rectangle (Point pointA,Point pointB,Point pointC,Point pointD){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }
    @Override
    public String printName() {
        return RECTANGLE.name();
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public float calcSquare() {
        return calcSideLength(pointA,pointB)*calcSideLength(pointB,pointC);
    }
}
