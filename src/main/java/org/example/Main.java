package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NEON, true, 100);
        lamp.turnOn();

        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        ceiling.create();

        Bed bed = new Bed("double", 2, 2, 2, 2);
        System.out.println(bed.toString());

        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall southWall = new Wall("South");

        Wall[] walls = {northWall, eastWall, westWall, southWall};

        BedRoom bedRoom = new BedRoom(northWall, eastWall, southWall,
                westWall, ceiling, lamp,
                new Carpet(PaintColor.WHITE, 100, 200), "bedroom1", bed,
                new Wardrobe());
        System.out.println(bedRoom);
        bedRoom.createBedroom();

    }
}