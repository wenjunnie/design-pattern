package com.design.pattern.creational.factorymethod;

/**
 * @Author: wenjun
 * @Date: 2019/6/11 23:34
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
