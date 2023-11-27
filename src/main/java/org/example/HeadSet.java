package org.example;

public class HeadSet extends ElectronicDevice implements CanBeHifi {

    private boolean hifi;

    public boolean getHifi() {
        return hifi;
    }

    @Override
    public void setHifi(boolean hifi) {
        this.hifi = hifi;
    }
}
