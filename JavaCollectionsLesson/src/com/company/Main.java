package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre = new Theatre("The Theatre", 26, 1000);
        theatre.getSeats();
        if(theatre.reserveSeat("Z999")){
            System.out.println("Please pay.");
        } else {
            System.out.println("Seat is taken.");
        }

        if(theatre.reserveSeat("B01")){
            System.out.println("Please pay.");
        } else {
            System.out.println("Seat is taken.");
        }
    }
}
