package de.thro.inf.prg3.a05.collections;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUtillity {

    public static <T extends Plant> Map<PlantColor, SimpleList<Plant>> splitBedByColor(PlantBed<? extends Plant> bed){
        Map<PlantColor, SimpleList<Plant>> mapP = new HashMap<>();
        for(PlantColor c : PlantColor.values()){
            mapP.put(c, bed.getPlantsByColor(c));
        }
        return mapP;
    }
}
