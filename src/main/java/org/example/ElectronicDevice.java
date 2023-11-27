package org.example;

public class ElectronicDevice {

    private int priceInCent;
    private int energyConsumptionInWatt;
    private String name;

    public int getPriceInCent() {
        return priceInCent;
    }

    public void setPriceInCent(int priceInCent) {
        this.priceInCent = priceInCent;
    }

    public int getEnergyConsumptionInWatt() {
        return energyConsumptionInWatt;
    }

    public void setEnergyConsumptionInWatt(int energyConsumptionInWatt) {
        this.energyConsumptionInWatt = energyConsumptionInWatt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
