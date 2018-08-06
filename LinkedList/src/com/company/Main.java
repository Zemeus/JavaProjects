package com.company;


import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();
        LinkedList<Customer> list = new LinkedList<Customer>();
        Customer customer = new Customer("Andrew", 5);
        list.add(customer);
        System.out.println(list.toString());
        Customer customer2 = list.get(0);
        list.remove(customer2);
        System.out.println(list.toString());

        places.add("Sydney");
        places.add("Melbourne");
        places.add("Brisbane");
        places.add("Perth");
        places.add("Canberra");
        places.add("Adelaide");
        places.add("Darwin");

        printList(places);

        places.add(1, "Alice Springs");
        printList(places);

        places.remove("Alice Springs");
        printList(places);
    }

    private static void printList(LinkedList<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Now visiting " + iterator.next());
        }
        System.out.println("--------------------");
    }
}
