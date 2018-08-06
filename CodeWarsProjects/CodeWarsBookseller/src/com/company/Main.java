package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        //        A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5 or more capitals letters. The 1st letter of a code is the capital letter of the book category. In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0) which indicates the quantity of books of this code in stock.
        //
        //        For example an extract of one of the stocklists could be:
        //
        //        L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
        //                or
        //
        //        L = ["ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"] or ....
        //        You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :
        //
        //        M = {"A", "B", "C", "W"}
        //        or
        //
        //        M = ["A", "B", "C", "W"] or ...
        //        and your task is to find all the books of L with codes belonging to each category of M and to sum their quantity according to each category.
        //
        //        For the lists L and M of example you have to return the string (in Haskell/Clojure a list of pairs):
        //
        //        (A : 20) - (B : 114) - (C : 50) - (W : 0)
        //        where A, B, C, W are the categories, 20 is the sum of the unique book of category A, 114 the sum corresponding to "BKWRK" and "BTSQZ", 50 corresponding to "CDXEF" and 0 to category 'W' since there are no code beginning with W.
        //
        //        If L or M are empty return string is ""

        String[] L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String[] M = {"A", "B", "C", "W"};
        System.out.println(stockSummary(L, M));

    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        //use int[] to hold quantity of each letter, index 0 = A, index 25 = Z
        int[] letterCount = new int[26];
        String list = "";
        int letterIndex, quantity;

        if(lstOf1stLetter.length == 0)
            return list;

        if(lstOfArt.length == 0)
            return list;

        for(String s: lstOfArt){
            String[] artwork = s.split(" ");
            letterIndex = artwork[0].charAt(0) - 65;
            quantity = Integer.parseInt(artwork[1]);
            letterCount[letterIndex] += quantity;
        }

        for(String letter: lstOf1stLetter) {
            int index = letter.charAt(0) - 65;
            list += "(" + letter + " : " + Integer.toString(letterCount[index]) + ") - ";

        }


        return list.substring(0, list.length() - 3);
    }
}
