package com.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96,"开闭原则",348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse; //强转
        System.out.println("课程ID：" + javaCourse.getId() + " 课程名称：" + javaCourse.getName() + " 课程原价：" + javaCourse.getOriginPrince() + "元" + " 课程价格：" + javaCourse.getPrice()+"元");
    }
}
