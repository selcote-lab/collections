package com.tonasolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);

        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("The seat is already reserved ");
        }

        if(theatre.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        } else {
            System.out.println("The seat is already reserved ");
        }

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));

        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);



//        Collections.reverse(seatsCopy);
//        System.out.println("print seatsCopy");
//        printList(seatsCopy);
//        System.out.println("Printing theatre.seats");
//        printList(theatre.seats);
//
//        Collections.shuffle(seatsCopy);
//        sortList(seatsCopy);
//        System.out.println(" sortList ");
//        printList(seatsCopy);
//
//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat: list){
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice() + "$");
        }
        System.out.println();
        System.out.println("======================================");
    }

//    public static void sortList(List<? extends Theatre.Seat> list){
//        for(int i=0; i<list.size() -1; i++){
//            for(int j=i+1; j<list.size(); j++){
//                if(list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
