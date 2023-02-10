package Mod8HomeWork;

import java.awt.*;

public abstract class ShapeWithFourAngles implements ShapeWithAngles {
    Point pointA;
    Point pointB;
    Point pointC;
    Point pointD;

    @Override
    public float calcPerimeter() {
        return calcSideLength(pointA,pointB)
                +calcSideLength(pointB,pointC)
                +calcSideLength(pointC,pointD)
                +calcSideLength(pointD,pointA);
    }

    @Override
    public Point[] getPointApexes() {
        return new Point[]{pointA,pointB,pointC,pointD};
    }
}
