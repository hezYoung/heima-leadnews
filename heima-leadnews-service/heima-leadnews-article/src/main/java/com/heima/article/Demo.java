/**
 * 1. @ClassName Demo
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/5 10:37
 */
package com.heima.article;

import java.io.File;

public class Demo {
    public static void printfile(File directory) {
        // 获取目录下的所有文件和子目录
        File[] files = directory.listFiles();
        // 遍历文件和子目录
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("目录：" + file.getAbsolutePath());
                printfile(file);
            } else {
                // 如果是文件，则打印文件路径
                System.out.println("文件：" + file.getAbsolutePath());
            }
        }
    }
    public static void main(String[] args) {
        String Path = "C:\\Users\\15455\\Desktop\\java个人笔记";
        File directory = new File(Path);
        if (directory.exists()) {
            printfile(directory);
        } else {
            System.out.println("404");
        }
    }
    }


