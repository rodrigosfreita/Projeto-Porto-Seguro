package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Policy;
import model.SelfEvaluation;
import model.Client;
import model.ElectricalFailures;
import model.MechanicalFailures;
import model.Bodywork;
import model.History;
import model.Workshops;
import model.Budget;
import model.Order;
import model.Vehicle;

public class App {
    
    private static final LocalDate LocalDate = null;

    public static void main(String[] args) {
        // Registering a client

        Scanner input = new Scanner(System.in);

        System.out.println("Have your personal information ready");

        System.out.println("Enter your name: ");
        String clientName = input.nextLine();
        System.out.println(clientName);

        System.out.println("Enter your CPF: ");
        long clientCpf = input.nextLong();
        System.out.println(clientCpf);

        input.nextLine();

        System.out.println("Enter your address: ");
        String clientAddress = input.nextLine();
        System.out.println(clientAddress);

        System.out.println("Enter your phone number:");
        long clientPhone = input.nextLong();
        System.out.println(clientPhone);

        input.nextLine();

        System.out.println("Enter your email: ");
        String clientEmail = input.nextLine();
        System.out.println(clientEmail);

        System.out.println("Enter your gender: ");
        String clientGender = input.nextLine();
        System.out.println(clientGender);

        System.out.println("Enter your mother's name: ");
        String motherName = input.nextLine();
        System.out.println(motherName);

        System.out.println("Enter your RG: ");
        long clientRg = input.nextLong();
        System.out.println(clientRg);

        Client client = new Client(clientName, clientCpf, clientAddress, clientPhone,
                clientEmail, clientGender, motherName, clientRg);

        System.out.println("Have your vehicle information ready");

        System.out.println("Enter the manufacturing year: ");
        int manufacturingYear = input.nextInt();
        System.out.println(manufacturingYear);

        input.nextLine();

        System.out.println("Enter the brand: ");
        String brand = input.nextLine();
        System.out.println(brand);

        System.out.println("Enter the model year: ");
        int modelYear = input.nextInt();
        System.out.println(modelYear);

        input.nextLine();

        System.out.println("Enter the model description: ");
        String modelDescription = input.nextLine();
        System.out.println(modelDescription);

        System.out.println("Enter the vehicle value: ");
        int vehicleValue = input.nextInt();
        System.out.println(vehicleValue);

        input.nextLine();

        System.out.println("Enter the fuel type: ");
        String fuelType = input.nextLine();
        System.out.println(fuelType);

        System.out.println("Enter the engine type: ");
        String engineType = input.nextLine();
        System.out.println(engineType);

        System.out.println("Enter the maximum speed: ");
        int maxSpeed = input.nextInt();
        System.out.println(maxSpeed);

        Vehicle vehicle = new Vehicle(client, manufacturingYear, brand, modelYear, modelDescription,
                vehicleValue, fuelType, engineType, maxSpeed);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle);

        System.out.println("Have your policy information ready");

        System.out.println("Enter the franchise type: ");
        String franchiseType = input.nextLine();
        System.out.println(franchiseType);

        System.out.println("Enter the insurance value: ");
        int insuranceValue = input.nextInt();
        System.out.println(insuranceValue);

        System.out.println("Enter the coverage: ");
        int coverage = input.nextInt();
        System.out.println(coverage);

        input.nextLine();

        System.out.println("Enter the insurance validity: ");
        String insuranceValidity = input.nextLine();
        System.out.println(insuranceValidity);

        System.out.println("Enter the DPVAT: ");
        String dpvat = input.nextLine();
        System.out.println(dpvat);

        System.out.println("Enter the franchise value: ");
        int franchiseValue = input.nextInt();
        System.out.println(franchiseValue);

        input.nextLine();

        System.out.println("Enter the vehicle model: ");
        String vehicleModel = input.nextLine();
        System.out.println(vehicleModel);

        System.out.println("Enter the policy number: ");
        int policyNumber = input.nextInt();
        System.out.println(policyNumber);

        Policy policy = new Policy(vehicle, client, franchiseType, insuranceValue, coverage, insuranceValidity, 
                dpvat, null, franchiseValue, vehicleModel, policyNumber);

        System.out.println("Have your vehicle history ready");

        System.out.println("Enter the irregularities: ");
        String irregularities = input.nextLine();
        System.out.println(irregularities);

        System.out.println("Enter the accident location: ");
        String accidentLocation = input.nextLine();
        System.out.println(accidentLocation);

        System.out.println("Enter the license time: ");
        String licenseTime = input.nextLine();
        System.out.println(licenseTime);

        System.out.println("Enter any fines: ");
        String fines = input.nextLine();
        System.out.println(fines);

        System.out.println("Enter the accident coverage: ");
        String accidentCoverage = input.nextLine();
        System.out.println(accidentCoverage);

        System.out.println("Enter the damage description: ");
        String damageDescription = input.nextLine();
        System.out.println(damageDescription);

        History history = new History(policy, client, vehicles, irregularities, accidentLocation, licenseTime, fines,
                accidentCoverage, damageDescription);

        int option = 4;
        ElectricalFailures electricalFailures = new ElectricalFailures();
        MechanicalFailures mechanicalFailures = new MechanicalFailures();
        Bodywork bodywork = new Bodywork();
        SelfEvaluation selfEvaluation = new SelfEvaluation();

        while(option != 0) {
            System.out.println("You started the self-diagnosis");
            System.out.println("To enter electrical failures press 1 \n" +
                               "To enter mechanical failures press 2 \n" +
                               "For bodywork issues press 3\n" +
                               "To return to the main menu press 5");
            int selfDiagnosisOption = input.nextInt();

            if(selfDiagnosisOption == 1) {
                System.out.println("Alternators: ");
                boolean alternators = input.nextBoolean();

                System.out.println("Alternator belt: ");
                boolean alternatorBelt = input.nextBoolean();

                System.out.println("Fuses: ");
                boolean fuses = input.nextBoolean();

                System.out.println("Ignition system: ");
                boolean ignitionSystem = input.nextBoolean();

                System.out.println("Lighting: ");
                boolean lighting = input.nextBoolean();

                System.out.println("Cables: ");
                boolean cables = input.nextBoolean();

                System.out.println("Spark plugs: ");
                boolean sparkPlugs = input.nextBoolean();

                System.out.println("Coil: ");
                boolean coil = input.nextBoolean();

                electricalFailures = new ElectricalFailures(vehicle, alternators, alternatorBelt, fuses, ignitionSystem, 
                        lighting, cables, sparkPlugs, coil);
            } 
            else if(selfDiagnosisOption == 2) {
                System.out.println("Overheating: ");
                boolean overheating = input.nextBoolean();

                System.out.println("Ignition: ");
                boolean ignition = input.nextBoolean();

                System.out.println("Noises and rattles: ");
                boolean noisesRattles = input.nextBoolean();

                System.out.println("Increased fuel consumption: ");
                boolean increasedFuel = input.nextBoolean();

                System.out.println("Black smoke: ");
                boolean blackSmoke = input.nextBoolean();

                System.out.println("Loss of power: ");
                boolean powerLoss = input.nextBoolean();

                System.out.println("Water tank issues: ");
                boolean waterTank = input.nextBoolean();

                System.out.println("Increased temperature: ");
                boolean increasedTemperature = input.nextBoolean();

                mechanicalFailures = new MechanicalFailures(vehicle, overheating, ignition, noisesRattles, increasedFuel,
                        blackSmoke, powerLoss, waterTank, increasedTemperature);
            }
            else if(selfDiagnosisOption == 3) {
                System.out.println("Rust: ");
                boolean rust = input.nextBoolean();

                System.out.println("Small dents: ");
                boolean smallDents = input.nextBoolean();

                System.out.println("Bumps: ");
                boolean bumps = input.nextBoolean();

                System.out.println("Cracks: ");
                boolean cracks = input.nextBoolean();

                System.out.println("Paint renewal: ");
                boolean paintRenewal = input.nextBoolean();

                System.out.println("Polishing: ");
                boolean polishing = input.nextBoolean();

                System.out.println("Sealing: ");
                boolean sealing = input.nextBoolean();

                System.out.println("Fairing: ");
                boolean fairing = input.nextBoolean();

                bodywork = new Bodywork(vehicle, rust, smallDents, bumps, cracks,
                        paintRenewal, polishing, sealing, fairing);
            } 
            else {
                selfEvaluation = new SelfEvaluation(electricalFailures, mechanicalFailures, bodywork);
                option = 0;
            }
        }

        Budget budget = new Budget(selfEvaluation, client, 100, 150, 200, 250, 300, 350, 50);

        Workshops workshop = new Workshops(budget, 1, "Cavalo Manco Street", 11932849483L, 0000000, 564239426423651L, 
                "Porto AutoAssist", 2847, "Parts Market");

        Order order = new Order(budget, workshop, 1, 01, client, 600, 100, 1234, 0000);

        input.close();
    }
}

