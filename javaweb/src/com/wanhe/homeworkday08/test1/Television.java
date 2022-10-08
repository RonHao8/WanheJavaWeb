package com.wanhe.homeworkday08.test1;

public class Television extends ElectricalAppliance{
    private String screenSize;
    private String resolutionRatio;

    public Television() {
    }

    public Television(String brand, String model, String color, double price, String screenSize, String resolutionRatio) {
        super(brand, model, color, price);
        this.screenSize = screenSize;
        this.resolutionRatio = resolutionRatio;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolutionRatio() {
        return resolutionRatio;
    }

    public void setResolutionRatio(String resolutionRatio) {
        this.resolutionRatio = resolutionRatio;
    }
}
