package com.mavenProject1;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public abstract class GeometricShape {
    public double area;
    public double perimeter;
    public abstract String toString();
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
