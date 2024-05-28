package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Master Bedroom", new Wall("North"), new Wall("South"), new Wall("East"), new Wall("West"), new Ceiling(3, PaintColor.WHITE), new Bed("Modern", 2, 20, 4, 1), new Lamp(LampType.NEON, true, 75), new Wardrobe(100, 200, 75.5), new Carpet(200, 300, PaintColor.RED));

    }
}