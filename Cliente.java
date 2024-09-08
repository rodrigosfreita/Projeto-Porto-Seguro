package model;

public class Client {
    
    private String name;
    private long cpf;
    private String address;
    private long phone;
    private String email;
    private String gender;
    private String motherName;
    private long rg;

    public Client(String name, long cpf, String address, long phone, String email, String gender, String motherName, long rg) {        
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.motherName = motherName;
        this.rg = rg;
        
        System.out.println("Full constructor - Client object created!");
    }

    public Client() {
        System.out.println("Empty constructor - Client object created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Client[name=" + name + ", cpf=" + cpf + ", address=" + address + ", phone=" + phone + 
                ", email=" + email + ", gender=" + gender + ", motherName=" + motherName + ", rg=" + rg + "]";
    }
}
