package com.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {
    @Override
    public void method(HashMap hashMap) {
        System.out.println("子类HashMap入参方法被执行");
    }

    public void method(Map Map) {
        System.out.println("子类Map入参方法被执行");
    }
}
