package model;

public class Workshops {

    private Budget budget;
    private int workshopNumber;
    private String address;
    private long phone;
    private int postalCode;
    private long cnpj;
    private String tradeName;
    private int stateRegistration;
    private String partsSupplier;

    public Workshops(Budget budget, int workshopNumber, String address, long phone, int postalCode,
                     long cnpj, String tradeName, int stateRegistration, String partsSupplier) {
        this.budget = budget;
        this.workshopNumber = workshopNumber;
        this.address = address;
        this.phone = phone;
        this.postalCode = postalCode;
        this.cnpj = cnpj;
        this.tradeName = tradeName;
        this.stateRegistration = stateRegistration;
        this.partsSupplier = partsSupplier;

        System.out.println("Full constructor - Workshops object created!");
    }

    public Workshops() {
        System.out.println("Empty constructor - Workshops object created!");
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public int getWorkshopNumber() {
        return workshopNumber;
    }

    public void setWorkshopNumber(int workshopNumber) {
        this.workshopNumber = workshopNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public int getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(int stateRegistration) {
        this.stateRegistration = stateRegistration;
    }

    public String getPartsSupplier() {
        return partsSupplier;
    }

    public void setPartsSupplier(String partsSupplier) {
        this.partsSupplier = partsSupplier;
    }

    @Override
    public String toString() {
        return "Workshops[budget=" + budget + ", workshopNumber=" + workshopNumber + ", address=" + address +
               ", phone=" + phone + ", postalCode=" + postalCode + ", cnpj=" + cnpj +
               ", tradeName=" + tradeName + ", stateRegistration=" + stateRegistration +
               ", partsSupplier=" + partsSupplier + "]";
    }
}
