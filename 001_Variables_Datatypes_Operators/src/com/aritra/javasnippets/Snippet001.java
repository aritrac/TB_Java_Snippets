package com.aritra.javasnippets;
/*
Snippet001
Shows basic variable declarations and definitions
 */
public class Snippet001 {

    public static void main(String[] args) {
        //storing the number
	    int myFirstNumber = 6 + 5;
	    int mySecondNumber = 12;
	    int myThirdNumber = myFirstNumber * 2;

	    int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

	    //displaying the number
	    System.out.println(myFirstNumber);

	    //displaying a string
        System.out.println("myFirstNumber");

        //displaying the total
        System.out.println(myTotal);

        //subtracting the myTotal value from 1000 and showing that on the screen
        System.out.println(1000 - myTotal);
    }
}
