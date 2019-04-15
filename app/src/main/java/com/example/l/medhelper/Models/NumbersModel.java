package com.example.levon.medhelper.Models;

public class NumbersModel {
    private String nameOfHospital;
    private String hasceOfHospital;
    private String numberOfHospital;

    public NumbersModel(String nameOfHospital, String hasceOfHospital, String numberOfHospital) {
        this.nameOfHospital = nameOfHospital;
        this.hasceOfHospital = hasceOfHospital;
        this.numberOfHospital = numberOfHospital;
    }

    public String getNameOfHospital() {
        return nameOfHospital;
    }

    public String getHasceOfHospital() {
        return hasceOfHospital;
    }

    public String getNumberOfHospital() {
        return numberOfHospital;
    }
}
