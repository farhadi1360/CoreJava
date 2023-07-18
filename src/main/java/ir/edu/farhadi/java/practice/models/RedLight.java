package ir.edu.farhadi.java.practice.models;

public class RedLight extends Penalty{

    private double penaltyFee;

    public RedLight(double penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public double getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(double penaltyFee) {
        this.penaltyFee = penaltyFee;
    }
}
