package classwork.classwork_38.example2;

public class Animal {
    private String species;
    private String habitationArea;
    private double averegeLifespan;

    public Animal(String species, String habitationArea, double averegeLifespan) {
        this.species = species;
        this.habitationArea = habitationArea;
        this.averegeLifespan = averegeLifespan;
    }

    public String getSpecies() {
        return species;
    }

    public String getHabitationArea() {
        return habitationArea;
    }

    public double getAveregeLifespan() {
        return averegeLifespan;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHabitationArea(String habitationArea) {
        this.habitationArea = habitationArea;
    }

    public void setAveregeLifespan(double averegeLifespan) {
        this.averegeLifespan = averegeLifespan;
    }
}
