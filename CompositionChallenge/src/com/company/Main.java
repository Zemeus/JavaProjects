package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Room myRoom = new Room(new Bed(new Dimension(3,3,6), "blue"), new LightSwitch(new Light()));

        myRoom.getLightSwitch().flipSwitch();
        System.out.println(myRoom.getLightSwitch().getLight().getBrightness());
        myRoom.getLightSwitch().flipSwitch();
        System.out.println(myRoom.getLightSwitch().getLight().getBrightness());


    }
}
