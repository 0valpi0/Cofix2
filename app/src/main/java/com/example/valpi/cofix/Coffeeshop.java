package com.example.valpi.cofix;

public class Coffeeshop {
    private String city;
    private String adress;

    public Coffeeshop(String city, String adress){

        this.city = city;
        this.adress = adress;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

