package com.pluralsight.CellPhoneService1;

public class CellPhone {
    private int serialNumber = 0;
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";
    private String dial = "";


    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner, String dial) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        this.dial = dial;
    }

    public void dial(String phoneNumbertocall) {
        System.out.println(this.owner + "'s phone is calling " + phoneNumbertocall);

    }

    public String getDial() {
        return dial;
    }

    public void setDial (String dial) {
        this.dial = dial;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
}
