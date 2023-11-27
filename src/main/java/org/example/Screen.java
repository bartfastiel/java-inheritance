package org.example;

public class Screen extends ElectronicDevice implements CanBeHifi {

    private int resolutionX;
    private int resolutionY;
    private int inch;
    private boolean hifi;

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public boolean getHifi() {
        return hifi;
    }

    @Override
    public void setHifi(boolean hifi) {
        this.hifi = hifi;
    }
}
