package com.formation.poe.geometry;

public class RightTriangle extends Rectangle {

    // constructors

    public RightTriangle()
    {
        super(); // this line is not necessary
    }

    public RightTriangle(double width, double height){
        super(width, height);
    }

    // methods

    @Override
    public double getArea(){
        return super.getArea() / 2;
    }

    public double getHypotenuse()
    {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }

    @Override
    public double getPerimeter(){
        return getWidth() + getHeight() + getHypotenuse();
    }

    // toString()

    public String toString(){
        return("Right triangle: " + getHeight() + " x " + getWidth());
    }
}
