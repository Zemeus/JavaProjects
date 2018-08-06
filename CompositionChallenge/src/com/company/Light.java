package com.company;

public class Light {
    private boolean isOn;
    private String brightness;

    public Light() {
        this.isOn = false;
        this.brightness = "Light is off...";
    }

    public boolean isOn() {
        return isOn;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setOnOff() {
        isOn = ! isOn;

        if(isOn)
            brightness = "Light shines bright...";
        else
            brightness = "Light is off...";
    }


}




