package com.company.lspold;


class Draw{

    public  void calcaluteArea(Rectangle rectangle){
        System.out.println("Alan:"+rectangle.getArea());
}
    public  void calcaluteAreaSquare(Square square){
        System.out.println("Alan:"+square.getArea());
    }
}

public class Main {

    public static void main(String[] args) {
        Draw d = new Draw();

        d.calcaluteArea(new Rectangle(10,20));

        d.calcaluteAreaSquare(new Square(14,25));

    }
}
