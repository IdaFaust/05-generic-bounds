package de.thro.inf.prg3.a05.collections;

public class Flower extends Plant {

    private PlantColor pc;

    public Flower(double h, String f, String n, PlantColor c){
        super(h, f, n);
        if(c == PlantColor.GREEN){
            throw new IllegalArgumentException("Blumen sind nicht grün!!");
        }
        this.pc = c;

    }
    @Override
    public PlantColor getColor() {
        return pc;
    }
}
