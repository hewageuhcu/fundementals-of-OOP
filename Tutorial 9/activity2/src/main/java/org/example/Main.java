package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter number:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();


        String binaryString = Integer.toBinaryString(num);

        System.out.println("The binary representation is: " + binaryString);


        int count = count1s(num);
        System.out.println("Count of 1s is: " + count);
    }

    public static int count1s(int num) {
        int count = 0;

        while (num != 0) {
            if ((num & 1) == 1) {
                count++;
            }

            num = num >> 1;
        }

        return count;
    }
}
