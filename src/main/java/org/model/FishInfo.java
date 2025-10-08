package main.java.org.model;
import java.util.ArrayList;

public class FishInfo {
    private String species;
    private String ageWeeks;
    private String avgWeightGrams;
    private String  amountOfFishes;

    ArrayList<String> fish = new ArrayList<String>();

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAgeWeeks() {
        return ageWeeks;
    }

    public void setAgeWeeks(String ageWeeks) {
        this.ageWeeks = ageWeeks;
    }

    public String getAvgWeightGrams() {
        return avgWeightGrams;
    }

    public void setAvgWeightGrams(String avgWeightGrams) {
        this.avgWeightGrams = avgWeightGrams;
    }

    public String getAmountOfFishes() {
        return amountOfFishes;
    }

    public void setAmountOfFishes(String amountOfFishes) {
        this.amountOfFishes = amountOfFishes;
    }

    public ArrayList<String> collectFishInfomation(String species, String ageWeeks, String avgWeightGrams, String amountOfFishes ) {
        if (!species.matches("[a-zA-Z]+")) throw new IllegalArgumentException("Enter alphabets only");
        if (!ageWeeks.matches("[0-9]+")) throw new IllegalArgumentException("Enter  digits only");
        if (!avgWeightGrams.matches("^[0-9]*\\.?[0-9]+$")) throw new IllegalArgumentException("Enter a valid number (decimal only)");
        if (!amountOfFishes.matches("^[0-9]*\\.?[0-9]+$")) throw new IllegalArgumentException("Enter a digits only");

        fish.add(species);
        fish.add(ageWeeks);
        fish.add(avgWeightGrams);
        fish.add(amountOfFishes);
        
        return fish;
    }

}
