package com.workintech.abstraction.product;

import javax.swing.*;

public class Chocolate extends ProductForSale{
    private String color;
    private boolean hasSugar;


    public Chocolate(String type, double price, String description , String color , boolean hasSugar) {
        super(type, price, description);
        this.color = color;
        this.hasSugar = hasSugar;


    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void showDetails() {
       String result =super.toString();
       StringBuilder builder=new StringBuilder();
        builder.append("Type" + color + "\n");
        builder.append("Type" + hasSugar + "\n");
        builder.append(  "-------\n");
        System.out.println(result + builder.toString());
    }
}
