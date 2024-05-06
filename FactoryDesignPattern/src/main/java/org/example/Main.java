package org.example;

import ShipFactory.Factory;
import Ship.Ship;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Factory factory = new Factory();
        Ship ship = factory.makeShip("V");
        if (ship != null) {
            System.out.println(ship.getName());
        } else {
            System.out.println("Invalid Ship Type");
        }
    }
}