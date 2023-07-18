package ir.edu.farhadi.java.practice.models;

public class SpeedLimit extends Penalty{

    private double penaltyFee;

    public SpeedLimit(double penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public double getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(double penaltyFee) {
        this.penaltyFee = penaltyFee;
    }
}
