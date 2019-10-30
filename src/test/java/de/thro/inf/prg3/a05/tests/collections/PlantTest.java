package de.thro.inf.prg3.a05.tests.collections;

import de.thro.inf.prg3.a05.collections.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class PlantTest {

    private Flower gb, tp, ro;
    private Shrub hs;
    private PlantBed bed;

    @BeforeEach
    void setup() {
        gb = new Flower(0.1, "Wiesenblume", "Gänseblümchen", PlantColor.YELLOW);
        hs = new Shrub(1.1, "BeerenStrauch", "Himmbeerstrauch");
        tp = new Flower(0.1, "Wiesenblume", "Gänseblümchen", PlantColor.YELLOW);
        ro = new Flower(0.1, "Wiesenblume", "Gänseblümchen", PlantColor.RED);

        bed = new PlantBed();

        bed.add(gb);
        bed.add(hs);
        bed.add(tp);
        bed.add(ro);
    }

    @Test

    void TestCollor(){

        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new Flower(0.1, "Wiesenblume", "Gänseblümchen", PlantColor.GREEN);
            }
        });

    }

    void TestPlantBedSIZEundADD (){
        assertEquals(4, bed.size());
    }

    void TestPlantBedGETplantsBYcollor (){
        assertEquals(2,bed.getPlantsByColor(PlantColor.YELLOW));
    }
}
