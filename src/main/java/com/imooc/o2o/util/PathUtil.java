package com.imooc.o2o.util;

public class PathUtil {
    public static String getImgbasePath() {
        String os = System.getProperty("os.name");
        String bastPath = "";
        if (os.toLowerCase().startsWith("win")) {
            bastPath = "D:/image";
        } else {

        }
    }
}
