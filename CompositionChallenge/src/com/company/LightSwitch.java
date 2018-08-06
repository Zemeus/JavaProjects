package com.company;

public class LightSwitch {
    private Light light;

    public LightSwitch(Light light) {
        this.light = light;
    }

    public Light getLight() {
        return light;
    }

    public void flipSwitch() {
        getLight().setOnOff();
    }
}
