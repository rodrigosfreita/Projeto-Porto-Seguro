package model;

public class Order {

    private Budget budget;
    private Workshops workshop;
    private int bodyworkNumber;
    private int workshopNumber;
    private Client clientCpf;
    private int repairCost;
    private int revisionCost;
    private int invoiceNumber;
    private int purchaseCode;

    public Order(Budget budget, Workshops workshop, int bodyworkNumber,
                 int workshopNumber, Client clientCpf, int repairCost, int revisionCost,
                 int invoiceNumber, int purchaseCode) {
        
        this.budget = budget;
        this.workshop = workshop;
        this.bodyworkNumber = bodyworkNumber;
        this.workshopNumber = workshopNumber;
        this.clientCpf = clientCpf;
        this.repairCost = repairCost;
        this.revisionCost = revisionCost;
        this.invoiceNumber = invoiceNumber;
        this.purchaseCode = purchaseCode;

        System.out.println("Full constructor - Order object created!");
    }

    public Order() {
        System.out.println("Empty constructor - Order object created!");
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

    public Workshops getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshops workshop) {
        this.workshop = workshop;
    }

    public int getBodyworkNumber() {
        return bodyworkNumber;
    }

    public void setBodyworkNumber(int bodyworkNumber) {
        this.bodyworkNumber = bodyworkNumber;
    }

    public Client getClientCpf() {
        return clientCpf;
    }

    public void setClientCpf(Client clientCpf) {
        this.clientCpf = clientCpf;
    }

    public int getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }

    public int getRevisionCost() {
        return revisionCost;
    }

    public void setRevisionCost(int revisionCost) {
        this.revisionCost = revisionCost;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(int purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public String generateOrder() {
        return "Order[budget=" + budget + ", workshop=" + workshop + 
               ", bodyworkNumber=" + bodyworkNumber + ", workshopNumber=" + workshopNumber + 
               ", clientCpf=" + clientCpf + ", repairCost=" + repairCost + 
               ", revisionCost=" + revisionCost + ", invoiceNumber=" + invoiceNumber + 
               ", purchaseCode=" + purchaseCode + ", purchaseDate]";
    }
}
