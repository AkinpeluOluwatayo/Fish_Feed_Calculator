package main.java.org.model;

public class FishCalculator {
    private double averageWeight;
    private double bioMass;

    public double getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public double getBioMass() {
        return bioMass;
    }

    public void setBioMass(double bioMass) {
        this.bioMass = bioMass;
    }



    public static double averageWeight(double totalWeightOfFish, double numberOfFishes) {
        return   totalWeightOfFish / numberOfFishes;
    }

    public static double bioMass(double averageWeight, double totalNumberOfFish) {
        return  averageWeight * totalNumberOfFish;
    }
























}
