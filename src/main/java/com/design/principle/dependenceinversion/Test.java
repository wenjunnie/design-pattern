package com.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyCourse();

        geely.setiCourse(new FECourse());
        geely.studyCourse();
    }
}
