Vehicle Insurance and Repair Management System
Overview
This project simulates a vehicle insurance and repair management system. It allows the registration of clients, vehicles, insurance policies, vehicle histories, and the self-evaluation of potential vehicle failures. The application also provides a budget estimation based on vehicle failures and repair costs. Finally, it manages orders for vehicle repair services and allows users to select workshops for repairs.

Features
Client Registration: The system allows users to input and register client information such as name, CPF, address, phone number, email, gender, and RG.

Vehicle Registration: Users can input vehicle-related details, including manufacturing year, model year, brand, description, value, fuel type, engine type, and max speed.

Policy Management: The system allows the creation and management of insurance policies for vehicles, including franchise type, insurance value, coverage, validity, and DPVAT.

Vehicle History: Users can track and manage the history of the vehicle, including irregularities, accidents, fines, and damage descriptions.

Self-Evaluation: This feature enables users to perform self-diagnoses on the vehicle to identify electrical, mechanical, and bodywork failures.

Budget Estimation: The system generates a budget estimate for vehicle repairs based on the self-evaluation report and repair service costs.

Order Management: The system allows users to place orders for repairs, track the cost, and choose workshops for the repair process.

Class Structure
1. Client
The Client class is responsible for storing client details:

Attributes: name, cpf, address, phone, email, gender, motherName, rg
Methods: Getters, Setters, and toString
2. Vehicle
The Vehicle class holds vehicle-related information:

Attributes: client, manufacturingYear, brand, modelYear, modelDescription, vehicleValue, fuelType, engineType, maxSpeed
Methods: Getters, Setters, and toString
3. Policy
The Policy class stores insurance policy information for a vehicle:

Attributes: vehicle, client, franchiseType, insuranceValue, coverage, insuranceValidity, dpvat, registrationDate, franchiseValue, vehicleModel, policyNumber
Methods: Constructor and toString
4. History
The History class keeps track of vehicle incidents:

Attributes: policy, client, vehicles, irregularities, accidentLocation, licenseDuration, fines, accidentCoverage, damageDescription
Methods: Constructor and toString
5. SelfEvaluation
The SelfEvaluation class helps users to perform a self-assessment of their vehicle:

Attributes: electricalFailures, mechanicalFailures, bodywork
Methods: selfEvaluationReport()
6. ElectricalFailures
The ElectricalFailures class tracks electrical-related issues in the vehicle:

Attributes: vehicle, alternators, alternatorBelt, fuses, ignitionSystem, lighting, cables, sparkPlugs, coil
Methods: Getters, Setters, and toString
7. MechanicalFailures
The MechanicalFailures class captures mechanical-related issues:

Attributes: vehicle, overheating, ignition, noisesAndRattles, increasedFuelConsumption, blackSmoke, powerLoss, waterTank, increasedTemperature
Methods: Getters, Setters, and toString
8. Bodywork
The Bodywork class handles information regarding the vehicle's bodywork issues:

Attributes: vehicle, rust, smallDentRepair, bumps, cracks, paintRenewal, polishing, sealing, fairing
Methods: Getters, Setters, and toString
9. Budget
The Budget class estimates the cost of repairing the vehicle based on self-evaluation:

Attributes: evaluation, clientDetails, partsCost, laborCost, electricalCost, mechanicalCost, generalExpenses, materials, serviceWarranty
Methods: Getters, Setters, and toString
10. Workshops
The Workshops class manages workshop information for vehicle repairs:

Attributes: budget, workshopNumber, address, phone, postalCode, cnpj, tradeName, stateRegistration, partsSupplier
Methods: Getters, Setters, and toString
11. Order
The Order class handles the orders placed by clients for vehicle repair services:

Attributes: budget, workshop, bodyworkNumber, workshopNumber, clientCpf, repairCost, revisionCost, invoiceNumber, purchaseCode
Methods: Getters, Setters, and generateOrder()
12. FailureAnalysis
The FailureAnalysis class contains logic to evaluate vehicle conditions based on user inputs:

Methods: evaluateVehicle(int option)
How to Run the Application
Run the App class to start the application.
Follow the on-screen instructions to input client information, vehicle details, and other necessary data.
Use the self-evaluation tool to diagnose potential vehicle issues.
Generate a repair budget based on the self-evaluation.
Place an order for repairs and choose a workshop.
Dependencies
Java SDK: Ensure you have the latest version of the Java SDK installed.
Scanner API: For reading user inputs from the console.






