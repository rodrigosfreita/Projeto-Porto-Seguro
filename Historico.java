package model;

import java.time.LocalDate;
import java.util.List;

public class History {

    private Policy policy;
    private Client client;
    private List<Vehicle> vehicles;
    private String irregularities;
    private String accidentLocation;
    private String licenseDuration;
    private String fines;
    private String accidentCoverage;
    private String damageDescription;

    public History(Policy policy, Client client, List<Vehicle> vehicles, String irregularities, String accidentLocation,
                   String licenseDuration, String fines, String accidentCoverage, String damageDescription) {
        this.policy = policy;
        this.client = client;
        this.vehicles = vehicles;
        this.irregularities = irregularities;
        this.accidentLocation = accidentLocation;
        this.licenseDuration = licenseDuration;
        this.fines = fines;
        this.accidentCoverage = accidentCoverage;
        this.damageDescription = damageDescription;

        System.out.println("Full constructor - History object created!");
    }

    public History() {
        System.out.println("Empty constructor - History object created!");
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getIrregularities() {
        return irregularities;
    }

    public void setIrregularities(String irregularities) {
        this.irregularities = irregularities;
    }

    public String getAccidentLocation() {
        return accidentLocation;
    }

    public void setAccidentLocation(String accidentLocation) {
        this.accidentLocation = accidentLocation;
    }

    public String getLicenseDuration() {
        return licenseDuration;
    }

    public void setLicenseDuration(String licenseDuration) {
        this.licenseDuration = licenseDuration;
    }

    public String getFines() {
        return fines;
    }

    public void setFines(String fines) {
        this.fines = fines;
    }

    public String getAccidentCoverage() {
        return accidentCoverage;
    }

    public void setAccidentCoverage(String accidentCoverage) {
        this.accidentCoverage = accidentCoverage;
    }

    public String getDamageDescription() {
        return damageDescription;
    }

    public void setDamageDescription(String damageDescription) {
        this.damageDescription = damageDescription;
    }

    @Override
    public String toString() {
        return "History[policy=" + policy + ", client=" + client + ", vehicles=" + vehicles + 
               ", irregularities=" + irregularities + ", accidentLocation=" + accidentLocation + 
               ", licenseDuration=" + licenseDuration + ", fines=" + fines + 
               ", accidentCoverage=" + accidentCoverage + ", damageDescription=" + damageDescription + "]";
    }
}
