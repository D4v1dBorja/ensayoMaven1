package com.mavenProject1;
import lombok.Setter;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
@Getter
@Setter
@SuperBuilder
public class Circle extends GeometricShape{
    private double radius;

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
