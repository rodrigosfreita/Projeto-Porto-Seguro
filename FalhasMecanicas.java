package model;

public class MechanicalFailures {
    
    private Vehicle vehicle;
    private boolean overheating;
    private boolean ignition;
    private boolean noisesAndRattles;
    private boolean increasedFuelConsumption;
    private boolean blackSmoke;
    private boolean powerLoss;
    private boolean waterTank;
    private boolean increasedTemperature;

    public MechanicalFailures(Vehicle vehicle, boolean overheating, boolean ignition, boolean noisesAndRattles,
                              boolean increasedFuelConsumption, boolean blackSmoke, boolean powerLoss, 
                              boolean waterTank, boolean increasedTemperature) {
        this.vehicle = vehicle;
        this.overheating = overheating;
        this.ignition = ignition;
        this.noisesAndRattles = noisesAndRattles;
        this.increasedFuelConsumption = increasedFuelConsumption;
        this.blackSmoke = blackSmoke;
        this.powerLoss = powerLoss;
        this.waterTank = waterTank;
        this.increasedTemperature = increasedTemperature;

        System.out.println("Full constructor - MechanicalFailures object created!");
    }

    public MechanicalFailures() {
        System.out.println("Empty constructor - MechanicalFailures object created!");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean getOverheating() {
        return overheating;
    }

    public void setOverheating(boolean overheating) {
        this.overheating = overheating;
    }

    public boolean getIgnition() {
        return ignition;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    public boolean getNoisesAndRattles() {
        return noisesAndRattles;
    }

    public void setNoisesAndRattles(boolean noisesAndRattles) {
        this.noisesAndRattles = noisesAndRattles;
    }

    public boolean getIncreasedFuelConsumption() {
        return increasedFuelConsumption;
    }

    public void setIncreasedFuelConsumption(boolean increasedFuelConsumption) {
        this.increasedFuelConsumption = increasedFuelConsumption;
    }

    public boolean getBlackSmoke() {
        return blackSmoke;
    }

    public void setBlackSmoke(boolean blackSmoke) {
        this.blackSmoke = blackSmoke;
    }

    public boolean getPowerLoss() {
        return powerLoss;
    }

    public void setPowerLoss(boolean powerLoss) {
        this.powerLoss = powerLoss;
    }

    public boolean getWaterTank() {
        return waterTank;
    }

    public void setWaterTank(boolean waterTank) {
        this.waterTank = waterTank;
    }

    public boolean getIncreasedTemperature() {
        return increasedTemperature;
    }

    public void setIncreasedTemperature(boolean increasedTemperature) {
        this.increasedTemperature = increasedTemperature;
    }

    @Override
    public String toString() {
        return "MechanicalFailures[vehicle=" + vehicle + ", overheating=" + overheating + ", ignition=" + ignition +
               ", noisesAndRattles=" + noisesAndRattles + ", increasedFuelConsumption=" + increasedFuelConsumption + 
               ", blackSmoke=" + blackSmoke + ", powerLoss=" + powerLoss + ", waterTank=" + waterTank + 
               ", increasedTemperature=" + increasedTemperature + "]";
    }
}
