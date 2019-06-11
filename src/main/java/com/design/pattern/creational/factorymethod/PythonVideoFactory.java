package com.design.pattern.creational.factorymethod;

/**
 * @Author: wenjun
 * @Date: 2019/6/11 23:43
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
