package model;

public class Bodywork {

    private Vehicle vehicle;
    private boolean rust;
    private boolean smallDentRepair;
    private boolean bumps;
    private boolean cracks;
    private boolean paintRenewal;
    private boolean polishing;
    private boolean sealing;
    private boolean fairing;

    public Bodywork(Vehicle vehicle, boolean rust, boolean smallDentRepair, boolean bumps,
                    boolean cracks, boolean paintRenewal, boolean polishing, boolean sealing,
                    boolean fairing) {
        this.vehicle = vehicle;
        this.rust = rust;
        this.smallDentRepair = smallDentRepair;
        this.bumps = bumps;
        this.cracks = cracks;
        this.paintRenewal = paintRenewal;
        this.polishing = polishing;
        this.sealing = sealing;
        this.fairing = fairing;

        System.out.println("Full constructor - Bodywork object created!");
    }

    public Bodywork() {
        System.out.println("Empty constructor - Bodywork object created!");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean getRust() {
        return rust;
    }

    public void setRust(boolean rust) {
        this.rust = rust;
    }

    public boolean getSmallDentRepair() {
        return smallDentRepair;
    }

    public void setSmallDentRepair(boolean smallDentRepair) {
        this.smallDentRepair = smallDentRepair;
    }

    public boolean getBumps() {
        return bumps;
    }

    public void setBumps(boolean bumps) {
        this.bumps = bumps;
    }

    public boolean getCracks() {
        return cracks;
    }

    public void setCracks(boolean cracks) {
        this.cracks = cracks;
    }

    public boolean getPaintRenewal() {
        return paintRenewal;
    }

    public void setPaintRenewal(boolean paintRenewal) {
        this.paintRenewal = paintRenewal;
    }

    public boolean getPolishing() {
        return polishing;
    }

    public void setPolishing(boolean polishing) {
        this.polishing = polishing;
    }

    public boolean getSealing() {
        return sealing;
    }

    public void setSealing(boolean sealing) {
        this.sealing = sealing;
    }

    public boolean getFairing() {
        return fairing;
    }

    public void setFairing(boolean fairing) {
        this.fairing = fairing;
    }

    @Override
    public String toString() {
        return "Bodywork[vehicle=" + vehicle + ", rust=" + rust + ", smallDentRepair=" + smallDentRepair + 
               ", bumps=" + bumps + ", cracks=" + cracks + ", paintRenewal=" + paintRenewal + 
               ", polishing=" + polishing + ", sealing=" + sealing + ", fairing=" + fairing + "]";
    }
}
