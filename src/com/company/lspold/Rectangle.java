package com.company.lspold;

public class Rectangle {

    public Rectangle(int height,int width){
        this.width=width;
        this.height=height;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){return this.height*this.width;}

    public int height;
    public int width;
}
