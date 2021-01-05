package com.company.lspnew;


class Draw{

    public  void calcaluteArea(Rectangle rectangle){
        System.out.println("Alan:"+rectangle.getArea());
}
}

public class Main {

    public static void main(String[] args) {
        Draw d = new Draw();
        d.calcaluteArea(new Rectangle(10,20));

        d.calcaluteArea(new Square(14,25));

    }
}
