package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {


    protected final String name;

    protected final int normalSpeed;

    protected int actualSpeed;

    protected int distanceTravelled;

    public abstract void prepareForLap(Race race);

    public final void moveForAnHour(){
        distanceTravelled += actualSpeed;
    }



    protected abstract String generateName();
    protected Vehicle(int normalSpeed){
        this.name = generateName();
        this.normalSpeed = normalSpeed;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("{")
                .append("distance travelled: ")
                .append(distanceTravelled)
                .append(", ")
                .append("type: ")
                .append(getClass().getSimpleName())
                .append(", ")
                .append("name: ")
                .append(name)
                .append("}");
        return sb.toString();
    }

}
