package com.formation.poe.geometry;

public class Rectangle {

    // attributes

    private double width;
    private double height;

    // constructors

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // methods

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width + height) * 2;
    }

    // getters & setters

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // toString()

    public String toString(){
        return "Square: " + width + " x " + height;
    }



}
