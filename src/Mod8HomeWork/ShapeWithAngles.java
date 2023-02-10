package Mod8HomeWork;

import java.awt.*;

public interface ShapeWithAngles extends Shape{
    default float calcSideLength(Point point1,Point point2) {
        return (float)Math.sqrt(Math.pow((point1.getX()- point2.getX()),2)
                +Math.pow((point1.getY()- point2.getY()),2));
    };
    float calcPerimeter();
    Point [] getPointApexes();
}
