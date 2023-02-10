package Mod8HomeWork;

import java.awt.*;

import static Mod8HomeWork.ShapeName.TRAPEZE;

public class Trapeze extends ShapeWithFourAngles implements ShapeWithLengthMiddleLine {
    private Color color = Color.YELLOW;
    public Trapeze (Point pointA, Point pointB, Point pointC, Point pointD){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }
    @Override
    public String printName() {
        return TRAPEZE.name();
    }
    @Override
    public void setColor(Color color) {
this.color =  color;
    }

    @Override
    public float calcSquare() {
        return calcSideLength(pointA,pointD)+calcSideLength(pointB,pointC)
                /Math.abs(calcSideLength(pointA,pointD)-calcSideLength(pointB,pointC))
                *(float)Math.sqrt(((calcPerimeter()/2) -calcSideLength(pointA,pointD))
                *((calcPerimeter()/2) -calcSideLength(pointB,pointC))
                *((calcPerimeter()/2) -calcSideLength(pointA,pointD)-calcSideLength(pointA,pointB))
                * ((calcPerimeter()/2) -calcSideLength(pointA,pointD)-calcSideLength(pointC,pointD)));
    }

    @Override
    public float calcLengthMiddleLine() {
        return (calcSideLength(pointA,pointD)+calcSideLength(pointB,pointC))/2;
    }
}
