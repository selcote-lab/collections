package com.tonasolution;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
//	    theatre.printSeats();

	    if(theatre.reserveSeat("")){
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, the seat already taken");
        }

//        if(theatre.reserveSeat("H11")){
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, the seat already taken");
//        }

    }
}
