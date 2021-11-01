package com.mavenProject1;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter

public class Circle extends GeometricShape{
    private double radius;

    public Circle(double radius) {
        super(0, 0);
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public double calculateArea(){
        area = Math.PI * Math.pow(radius,2.0);
        return area;
    }

    @Override
    public double calculatePerimeter(){
        perimeter = 2.0*Math.PI*radius;
        return perimeter;
    }

    @Override
    public String toString(){
        return "Radius = "+radius+", Area = "+area+", Perimeter = "+perimeter;
    }
}
