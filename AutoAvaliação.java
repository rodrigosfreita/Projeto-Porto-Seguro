package model;

public class SelfEvaluation {

    private ElectricalFailures electricalFailures;
    private MechanicalFailures mechanicalFailures;
    private Bodywork bodywork;

    public SelfEvaluation(ElectricalFailures electricalFailures, MechanicalFailures mechanicalFailures, Bodywork bodywork) {
        this.electricalFailures = electricalFailures;
        this.mechanicalFailures = mechanicalFailures;
        this.bodywork = bodywork;

        System.out.println("Full constructor - SelfEvaluation object created!");
    }

    public SelfEvaluation() {}

    public ElectricalFailures getElectricalFailures() {
        return electricalFailures;
    }

    public void setElectricalFailures(ElectricalFailures electricalFailures) {
        this.electricalFailures = electricalFailures;
    }

    public MechanicalFailures getMechanicalFailures() {
        return mechanicalFailures;
    }

    public void setMechanicalFailures(MechanicalFailures mechanicalFailures) {
        this.mechanicalFailures = mechanicalFailures;
    }

    public Bodywork getBodywork() {
        return bodywork;
    }

    public void setBodywork(Bodywork bodywork) {
        this.bodywork = bodywork;
    }

    @Override
    public String toString() {
        return "SelfEvaluation[electricalFailures=" + electricalFailures + ", mechanicalFailures=" + mechanicalFailures + ", bodywork=" + bodywork + "]";
    }

    public String selfEvaluationReport() {
        String selfEvaluation =
            this.electricalFailures.toString() + " " +
            this.mechanicalFailures.toString() + " " +
            this.bodywork.toString() + " ";

        String message = "These are the following issues: Electrical Failure " + this.electricalFailures.toString() +
                         ", Mechanical Failure " + this.mechanicalFailures.toString() +
                         ", Bodywork " + this.bodywork.toString() + selfEvaluation;

        return message;
    }
}
