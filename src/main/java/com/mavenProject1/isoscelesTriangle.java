package com.mavenProject1;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class isoscelesTriangle extends GeometricShape implements SideCounter {
    private double baseLength;
    private double sideLength;

    public isoscelesTriangle(double baseLength, double sideLength) {
        super(0,0);
        this.baseLength = baseLength;
        this.sideLength = sideLength;
        calculateArea();
        calculatePerimeter();
    }


    @Override
    public void numberOfSides(){
        System.out.println("This geometric shape has 3 sides, and two of them are equal.");
    }

    @Override
    public double calculateArea(){
        area = ((Math.sqrt(Math.pow(sideLength,2)-Math.pow((baseLength/2.0),2)))*baseLength)/2.0;
        return area;
    }

    @Override
    public double calculatePerimeter(){
        perimeter = 2*sideLength+baseLength;
        return perimeter;
    }

    @Override
    public String toString(){
        return "Base Length = "+baseLength+", Side Length = "+sideLength+", Area = "+area+", Perimeter = "+perimeter;
    }
}
