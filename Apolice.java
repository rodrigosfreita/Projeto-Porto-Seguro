package model;

import java.time.LocalDate;

public class Policy {
    private Vehicle vehicles;
    private Client clientNumber;
    private String franchiseType;
    private int insuranceValue;
    private int coverage;
    private String insuranceValidity;
    private String dpvat;
    private LocalDate registrationDate;
    private int franchiseValue;
    private String vehicleModel;
    private int policyNumber;

    public Policy(Vehicle vehicles, Client clientNumber, String franchiseType,
                  int insuranceValue, int coverage, String insuranceValidity, String dpvat,
                  LocalDate registrationDate, int franchiseValue, String vehicleModel, int policyNumber) {    
        
        this.vehicles = vehicles;
        this.clientNumber = clientNumber;
        this.franchiseType = franchiseType;
        this.insuranceValue = insuranceValue;
        this.coverage = coverage;
        this.insuranceValidity = insuranceValidity;
        this.dpvat = dpvat;
        this.registrationDate = registrationDate;
        this.franchiseValue = franchiseValue;
        this.vehicleModel = vehicleModel;
        this.policyNumber = policyNumber;

        System.out.println("Full constructor - Policy object created!");
    }
}
