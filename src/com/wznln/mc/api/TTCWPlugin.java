package com.wznln.mc.api;

import java.util.Objects;

public class TTCWPlugin {
    private String name;
    private int ver1;
    private int ver2;
    private int ver3;
    private String desc;
    private String main;
    private String fileName;
    private boolean running;

    public TTCWPlugin(String name, int ver1, int ver2, int ver3, String desc, String main,String fileName) {
        this.name = name.trim();
        this.ver1 = ver1;
        this.ver2 = ver2;
        this.ver3 = ver3;
        this.desc = desc;
        this.main = main.trim();
        this.fileName = fileName.trim();
    }

    public boolean start(){ return false; }

    public void stop(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TTCWPlugin)) return false;
        TTCWPlugin that = (TTCWPlugin) o;
        return main.equals(that.main);
    }

    @Override
    public int hashCode() {
        return Objects.hash(main);
    }

    public String getName() {
        return name;
    }

    public int getVer1() {
        return ver1;
    }

    public int getVer2() {
        return ver2;
    }

    public int getVer3() {
        return ver3;
    }

    public String getDesc() {
        return desc;
    }

    public String getMain() {
        return main;
    }

    public String getFileName() {
        return fileName;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
