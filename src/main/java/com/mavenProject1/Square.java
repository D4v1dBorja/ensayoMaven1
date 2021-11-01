package com.mavenProject1;
import lombok.Setter;
import lombok.Getter;
@Getter
@Setter

public class Square extends GeometricShape implements SideCounter {
    private double sideLength;

    public Square(double sideLength){
        super(0,0);
        this.sideLength = sideLength;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void numberOfSides(){
        System.out.println("This shape has 4 equal sides.");
    }

    @Override
    public double calculateArea(){
        area = sideLength*sideLength;
        return area;
    }

    @Override
    public double calculatePerimeter(){
        perimeter = 4.0*sideLength;
        return perimeter;
    }

    @Override
    public String toString(){
        return "Side Length = "+sideLength+", Area = "+area+", Perimeter = "+perimeter;
    }

}
