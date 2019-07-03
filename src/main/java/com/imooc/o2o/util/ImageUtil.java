package com.imooc.o2o.util;

import net.coobird.thumbnailator.Thumbnailator;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

public class ImageUtil {
    public static void main(String[] args) throws IOException {
        String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        basePath = URLDecoder.decode(basePath, "utf-8");
        System.out.println(basePath);
        Thumbnails.of(new File("D:\\2.jpeg"))
                .size(200, 200)
                .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "\\111.jpg")), 0.25f).outputQuality(0.8f)
                .toFile("/4.jpeg");

    }
}
