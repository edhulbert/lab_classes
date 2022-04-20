package org.example.classes;

public class Rectangle {

    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getDiagonal(){
        return Math.sqrt((this.length * this.length)
                + (this.width * this.width));
    }

    public float getLength(){
        return this.length;
    }

    public float getWidth(){
        return this.width;
    }

    public double getPerimeter(){
        return (this.length + this.width) * 2;
    }

}