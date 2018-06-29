package com.formation.poe.geometry;

public class Main {

    public static void main(String[] args){

        // Verification code

        // Rectangle

        Rectangle rect1 = new Rectangle(10, 5);
        System.out.println(rect1.toString());
        System.out.println("Surface = " + rect1.getArea());
        System.out.println("Perimeter = " + rect1.getPerimeter());

        System.out.println(); // line space

        // Right triangle

        RightTriangle trian1 = new RightTriangle(12, 15);
        System.out.println(trian1.toString());
        System.out.println("Surface = " + trian1.getArea());
        System.out.println("Perimeter = " + trian1.getPerimeter());

    }
}
