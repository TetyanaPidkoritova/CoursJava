package Mod8HomeWork;

import java.awt.*;

public interface ShapeWithoutAngle extends Shape  {
    float PI = 3.14f;
    float calcCircumference();
    float getRadius();
    void setRadius(float radius);
    Point getPointCenter();
    void setPointCenter(Point pointCenter);
}
