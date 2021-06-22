package com.wznln.mc.api;

import java.io.File;
import java.io.IOException;

public class FileAndDir {
    //创建
    public static boolean fileCreate(File path) {
        try {
            return path.createNewFile();
        } catch (IOException ex) {
            return false;
        }
    }
    //判断存在
    public static boolean dirExist(String path,boolean create) {
        File file = new File(path);
        if (file.exists()) {
            if (!file.isDirectory()) {
                if(create) {
                    return file.mkdirs();
                }else return false;
            }
        } else {
            if(create) {
                return file.mkdirs();
            }else return false;
        }
        return true;
    }
    public static boolean dirExist(String path) {
        return dirExist(path,true);
    }
    public static boolean fileExist(String path, boolean create) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                if (create) {
                    return fileCreate(file);
                }
                return false;
            } else {
                return true;
            }
        } else {
            if (create) {
                dirExist(file.getParentFile().getPath());
                return fileCreate(file);
            }
            return false;
        }
    }
}
