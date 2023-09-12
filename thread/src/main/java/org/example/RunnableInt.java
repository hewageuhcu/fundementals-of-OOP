package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class RunnableInt implements Runnable{
           @Override
           public void run() {
               Scanner scan=new Scanner(System.in);
               System.out.println("enter first name");
               String name1=scan.nextLine();
               System.out.println("enter second name");
              String name2=scan.nextLine();
              System.out.println(name1+" "+name2);
           }
           public static void main (String[] args){
               RunnableInt runnableInt=new RunnableInt();
               Thread t1=new Thread(runnableInt);
               Thread t2=new Thread(runnableInt);
               t1.start();
               t2.start();
           }
       }

