package Mod8HomeWork;

import java.awt.*;

import static Mod8HomeWork.ShapeName.TRIANGLE;

public class Triangle implements ShapeWithLengthMiddleLine,ShapeWithAngles {
    private Color color = DEFAULT_COLOR;
    Point pointA;
    Point pointB;
    Point pointC;

    public Triangle(Point pointA, Point pointB,Point pointC){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }
    @Override
    public String printName() {
        return TRIANGLE.name();
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public float calcSquare() {

        return (float)Math.sqrt((calcPerimeter()/2)
        * ((calcPerimeter()/2)-calcSideLength(pointB,pointC))
        * ((calcPerimeter()/2)-calcSideLength(pointC,pointA))
        * ((calcPerimeter()/2)-calcSideLength(pointA,pointB)));
    }

    @Override
    public float calcPerimeter() {
        return calcSideLength(pointA,pointB)
                +calcSideLength(pointB,pointC)
                +calcSideLength(pointC,pointA);
    }

    @Override
    public Point[] getPointApexes() {
        return new Point[]{pointA,pointB,pointC};
    }

    @Override
    public float calcLengthMiddleLine() {
        return calcSideLength(pointC,pointA)/2;
    }
}
