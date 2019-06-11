package com.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        // 反射实现
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null) return;
        video.produce();

//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null) return;
//        video.produce();
    }
}
