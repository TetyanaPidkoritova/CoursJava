package Mod8HomeWork;

import java.awt.*;

import static Mod8HomeWork.ShapeName.CIRCLE;

public class Circle implements ShapeWithoutAngle{
    private Color color = Color.BLUE;
    Point pointCenter;
    float radius;
    public Circle(Point pointCenter, float radius){
        this.pointCenter = pointCenter;
        this.radius = radius;
    }

    @Override
    public String printName() {
        return CIRCLE.name();
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public float calcSquare() {
        return PI*(float)Math.pow(getRadius(),2);
    }

    @Override
    public float calcCircumference() {
        return 2*PI*radius;
    }

    @Override
    public float getRadius() {
        return radius;
    }

    @Override
    public void setRadius(float radius) {
        this.radius = radius;

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
