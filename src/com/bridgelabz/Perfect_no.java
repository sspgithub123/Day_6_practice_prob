package com.bridgelabz;
import java.util.Scanner;

public class Perfect_no {
    public static void main(String[] args) {
        // Input Number:- 6------> 1 2 3 4 5 6
        // 6 -----> 1 + 2 + 3 = 6
        //

        int number, sum = 0;
        System.out.println("Enter any number:-");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;    // i =1;   i =2   i =3
            }
        }
        if (number == sum)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }
}
