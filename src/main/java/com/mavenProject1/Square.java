package com.mavenProject1;
import lombok.Setter;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
@Getter
@Setter
@SuperBuilder
public class Square extends GeometricShape implements SideCounter {
    private double sideLength;

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
