package model;

public class ElectricalFailures {

    private Vehicle vehicle;
    private boolean alternators;
    private boolean alternatorBelt;
    private boolean fuses;
    private boolean ignitionSystem;
    private boolean lighting;
    private boolean cables;
    private boolean sparkPlugs;
    private boolean coil;

    public ElectricalFailures(Vehicle vehicle, boolean alternators, boolean alternatorBelt,
                              boolean fuses, boolean ignitionSystem, boolean lighting, boolean cables,
                              boolean sparkPlugs, boolean coil) {
        this.vehicle = vehicle;
        this.alternators = alternators;
        this.alternatorBelt = alternatorBelt;
        this.fuses = fuses;
        this.ignitionSystem = ignitionSystem;
        this.lighting = lighting;
        this.cables = cables;
        this.sparkPlugs = sparkPlugs;
        this.coil = coil;

        System.out.println("Full constructor - ElectricalFailures object created!");
    }

    public ElectricalFailures() {
        System.out.println("Empty constructor - ElectricalFailures object created!");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean getAlternators() {
        return alternators;
    }

    public void setAlternators(boolean alternators) {
        this.alternators = alternators;
    }

    public boolean getAlternatorBelt() {
        return alternatorBelt;
    }

    public void setAlternatorBelt(boolean alternatorBelt) {
        this.alternatorBelt = alternatorBelt;
    }

    public boolean getFuses() {
        return fuses;
    }

    public void setFuses(boolean fuses) {
        this.fuses = fuses;
    }

    public boolean getIgnitionSystem() {
        return ignitionSystem;
    }

    public void setIgnitionSystem(boolean ignitionSystem) {
        this.ignitionSystem = ignitionSystem;
    }

    public boolean getLighting() {
        return lighting;
    }

    public void setLighting(boolean lighting) {
        this.lighting = lighting;
    }

    public boolean getCables() {
        return cables;
    }

    public void setCables(boolean cables) {
        this.cables = cables;
    }

    public boolean getSparkPlugs() {
        return sparkPlugs;
    }

    public void setSparkPlugs(boolean sparkPlugs) {
        this.sparkPlugs = sparkPlugs;
    }

    public boolean getCoil() {
        return coil;
    }

    public void setCoil(boolean coil) {
        this.coil = coil;
    }

    @Override
    public String toString() {
        return "ElectricalFailures[vehicle=" + vehicle + ", alternators=" + alternators + ", alternatorBelt=" +
                alternatorBelt + ", fuses=" + fuses + ", ignitionSystem=" + ignitionSystem + ", lighting=" +
                lighting + ", cables=" + cables + ", sparkPlugs=" + sparkPlugs + ", coil=" + coil + "]";
    }
}
