package com.mavenProject1;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
@Setter
@Getter
@SuperBuilder
public class isoscelesTriangle extends GeometricShape implements SideCounter {
    private double baseLength;
    private double sidelength;

    @Override
    public void numberOfSides(){
        System.out.println("This geometric shape has 3 sides, and two of them are equal.");
    }

    @Override
    public double calculateArea(){
        area = ((Math.sqrt(Math.pow(sidelength,2)-Math.pow((baseLength/2.0),2)))*baseLength)/2.0;
        return area;
    }

    @Override
    public double calculatePerimeter(){
        perimeter = 2*sidelength+baseLength;
        return perimeter;
    }

    @Override
    public String toString(){
        return "Base Length = "+baseLength+", Side Length = "+sidelength+", Area = "+area+", Perimeter = "+perimeter;
    }
}
