package com.formation.poe.geometry;

public class Point {

    private double x = 0;
    private double y = 0;

    public Point (double x, double y){
        x = 0;
        y = 0;
    }

    public Point (){
    }

    void moveTo(double x, double y) {
        x = x;
        y = y;
    }

    void display() {
        System.out.println("(" + getX() + ", " + getY() + ")");
    }

    void moveRelative() {
        setX(getX() + getX());
        setY(getY() + getY());
    }

    public double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    private double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString(){
        return "pippo";
    }

//    Point clone() {
//
//    }
}
