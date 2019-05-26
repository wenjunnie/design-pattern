package com.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrince() {
        return super.getPrice()*0.8;
    }
}
