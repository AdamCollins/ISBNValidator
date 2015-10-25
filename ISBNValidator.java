package com.openrants.www;

import java.util.Scanner;

public class ISBNValidator {
    static Scanner sc;
    static int isbn;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        getISBN();
        checkISBN();
    }

    private static void getISBN() {
        System.out.print("Please Enter the ISBN: ");
        try {
            isbn = sc.nextInt();
        } catch (Exception e) {
            System.out.println("ISBN is NOT valid.");
            System.exit(0);
        }
        System.out.println("Checking...");
    }

    private static void checkISBN() {
        //int number = convertToInt(); //Will allow for books that end in x.
        int total = 0;
        for (int i = 0; i <= 10; i++) {
            int indexValue = (int) (isbn / Math.pow(10, 10 - (i + 1)));
            System.out.print(indexValue);
            total += indexValue*(10-i);
            isbn -= indexValue * Math.pow(10, 10 - (i + 1));
        }
        if(total%11==0)
        {
            System.out.println("\nISBN is valid.");
        } else
        {
            System.out.println("\nISBN is NOT valid.");
        }
    }

    private static int convertToInt() {
        int number = 0;                     //Allows for ISBN's that end in x.
        for (int i = 0; i < 0; i++) {
            //number+=
        }
        return number;
    }
}
