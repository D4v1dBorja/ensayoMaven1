package com.mavenProject1;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){

        int listSize = readAmount();
        ArrayList<Object> allShapes = new ArrayList<>();
        fillList(allShapes,listSize);
        allShapes.stream().forEach(x -> System.out.println(x.toString()));
    }
    public static void fillList(ArrayList objectList, int amount){
        Scanner inputData = new Scanner(System.in);
        int whichOne;
        double extraParameter1;
        double extraParameter2;
        Object currentShape;
        for(int i=0;i<amount;i++){
            whichOne = kindOfShape(inputData);
            switch(whichOne){
                case 0:
                    System.out.print("What is the side length of the Square? ---->");
                    extraParameter1 = inputData.nextDouble();
                    currentShape = new Square(extraParameter1);
                    objectList.add(currentShape);
                    break;

                case 1:
                    System.out.print("What is the length of the equal sides of the triangle? ---->");
                    extraParameter1 = inputData.nextDouble();
                    System.out.print("What is the length of the base? ---->");
                    extraParameter2 = inputData.nextDouble();
                    currentShape = new isoscelesTriangle(extraParameter2,extraParameter1);
                    objectList.add(currentShape);
                    break;

                case 2:
                    System.out.print("What is the radius of the circle? ---->");
                    extraParameter1 = inputData.nextDouble();
                    currentShape = new Circle(extraParameter1);
                    objectList.add(currentShape);
                    break;

            }



        }
    }
    public static int readAmount(){
        Scanner scanAmount = new Scanner(System.in);
        System.out.println("How many objects are you going to create?");
        int amount = scanAmount.nextInt();
        return amount;
    }
    public static int kindOfShape(Scanner userData){
        System.out.print("What kind of shape is it? (0: Square, 1: Isosceles triangle, 2: Circle) ----> ");
        int kind = userData.nextInt();
        return kind;
    }
}
