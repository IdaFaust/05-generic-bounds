package de.thro.inf.prg3.a05.collections;

public abstract class Plant implements Comparable<Plant> {

    private double height;
    private String family;
    private String name;

    public Plant(double h, String f, String n){
        this.height = h;
        this.family = f;
        this.name = n;
    }

    public double getHeight(){
        return height;
    }

    public String getFamily(){
        return family;
    }

    public String getName(){
        return name;
    }

    public abstract PlantColor getColor();

    //Sortierung von klein nach Groß
    @Override
    public int compareTo(Plant o) {
        return Double.compare(this.getHeight(),o.getHeight());
    }
}
