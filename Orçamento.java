package model;

public class Budget {

    private SelfEvaluation evaluation;
    private Client clientDetails;
    private int partsCost;
    private int laborCost;
    private int electricalCost;
    private int mechanicalCost;
    private int generalExpenses;
    private int materials;
    private int serviceWarranty;

    public Budget(SelfEvaluation evaluation, Client clientDetails, int partsCost,
                  int laborCost, int electricalCost, int mechanicalCost, int generalExpenses,
                  int materials, int serviceWarranty) {
        this.evaluation = evaluation;
        this.clientDetails = clientDetails;
        this.partsCost = partsCost;
        this.laborCost = laborCost;
        this.electricalCost = electricalCost;
        this.mechanicalCost = mechanicalCost;
        this.generalExpenses = generalExpenses;
        this.materials = materials;
        this.serviceWarranty = serviceWarranty;

        System.out.println("Full constructor - Budget object created!");
    }

    public Budget() {
        System.out.println("Empty constructor - Budget object created!");
    }

    public SelfEvaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(SelfEvaluation evaluation) {
        this.evaluation = evaluation;
    }

    public Client getClientDetails() {
        return clientDetails;
    }

    public void setClientDetails(Client clientDetails) {
        this.clientDetails = clientDetails;
    }

    public int getPartsCost() {
        return partsCost;
    }

    public void setPartsCost(int partsCost) {
        this.partsCost = partsCost;
    }

    public int getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(int laborCost) {
        this.laborCost = laborCost;
    }

    public int getElectricalCost() {
        return electricalCost;
    }

    public void setElectricalCost(int electricalCost) {
        this.electricalCost = electricalCost;
    }

    public int getMechanicalCost() {
        return mechanicalCost;
    }

    public void setMechanicalCost(int mechanicalCost) {
        this.mechanicalCost = mechanicalCost;
    }

    public int getGeneralExpenses() {
        return generalExpenses;
    }

    public void setGeneralExpenses(int generalExpenses) {
        this.generalExpenses = generalExpenses;
    }

    public int getMaterials() {
        return materials;
    }

    public void setMaterials(int materials) {
        this.materials = materials;
    }

    public int getServiceWarranty() {
        return serviceWarranty;
    }

    public void setServiceWarranty(int serviceWarranty) {
        this.serviceWarranty = serviceWarranty;
    }
}
