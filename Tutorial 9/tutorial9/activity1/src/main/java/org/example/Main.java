package org.example;

import java.util.Scanner;




// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            int S = 10,E;

            System.out.println("enter S");
            Scanner scan=new Scanner(System.in);
            S=scan.nextInt();
            System.out.println("enter E");
            E=scan.nextInt();
            int count = countPrime(S, E);

            System.out.println("Total prime numbers :"  + count);
        }

        public static int countPrime(int S, int E) {
            int count = 0;
            for (int i = S; i <= E; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            return count;
        }

        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            if (n <= 3) {
                return true;
            }
            if (n % 2 == 0 || n % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }


