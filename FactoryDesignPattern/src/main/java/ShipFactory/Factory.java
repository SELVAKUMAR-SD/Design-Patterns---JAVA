package ShipFactory;

import Ship.RocketShip;
import Ship.UFOShip;
import Ship.Ship;

public class Factory {
    public Ship makeShip(String shipName) {
        return switch (shipName) {
            case "R" -> new RocketShip();
            case "U" -> new UFOShip();
            default -> null;
        };
    }
}
