package Mod8HomeWork;

import java.awt.*;

import static Mod8HomeWork.ShapeName.ELLIPSE;

public class Ellipse implements ShapeWithoutAngle{
    private Color color = Color.BLUE;
    Point pointCenter;
    float bigHalfAxis;
    float smallHalfAxis;
    float Circumference;

    @Override
    public String printName() {
        return ELLIPSE.name();
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public float calcSquare() {
        return PI*bigHalfAxis*smallHalfAxis;
    }

    @Override
    public float calcCircumference() {
        return Circumference;
    }

    @Override
    public float getRadius() {
        return smallHalfAxis;
    }

    @Override
    public void setRadius(float radius) {
        this.smallHalfAxis = radius;

    }

    @Override
    public Point getPointCenter() {
        return pointCenter;
    }

    @Override
    public void setPointCenter(Point pointCenter) {
        this.pointCenter = pointCenter;
    }
}
