package de.thro.inf.prg3.a05.collections;

public class Shrub extends Plant {

    private PlantColor pc;

    public Shrub(double h, String f, String n){
        super(h, f, n);
        this.pc = PlantColor.GREEN;
    }

    @Override
    public PlantColor getColor() {
        return pc;
    }
}
