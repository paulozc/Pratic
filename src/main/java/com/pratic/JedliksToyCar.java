package com.pratic;

public class JedliksToyCar {
    private int distance;
    private int battery = 100;

    public static JedliksToyCar buy() {
        JedliksToyCar miniCar = new JedliksToyCar();

        return miniCar;
    }

    public String distanceDisplay() {
        if (distance < 2000){
            return "Driven " + distance + " meters";
        }
        return "Driven 2000 meters";
    }

    public String batteryDisplay() {
        if (battery < 0){
            return "Battery empty";
        } else{
            return "Battery at " + battery + "%";
        }
    }

    public void drive() {
        this.distance += 20;
        this.battery -= 1;
    }
}
