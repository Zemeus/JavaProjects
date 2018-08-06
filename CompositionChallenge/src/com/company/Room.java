package com.company;

public class Room {

    private Bed bed;
    private LightSwitch lightSwitch;

    public Room(Bed bed, LightSwitch lightSwitch) {
        this.bed = bed;
        this.lightSwitch = lightSwitch;
    }

    public Bed getBed() {
        return bed;
    }

    public LightSwitch getLightSwitch() {
        return lightSwitch;
    }
}
