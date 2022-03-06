package com.bridgelabz;
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {

        int number, count = 0;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println("This is a Prime Number:-");
        else
            System.out.println("This is not a Prime Number:-");

    }
}
