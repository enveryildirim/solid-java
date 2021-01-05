package com.company.lspnew;

public class Square extends Rectangle{
    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        System.out.printf("Düzenleme yapıdlı");
    }
    @Override
    public void setWidth(int width) {
        super.setWidth(width); System.out.printf("Düzenleme yapıdlı");
    }
}
