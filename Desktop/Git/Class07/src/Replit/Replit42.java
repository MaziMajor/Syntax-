package Replit;

import java.util.Scanner;

public class Replit42 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the roll number of the Child");
        int roll=scan.nextInt();

        switch (roll){
            case 101:
                System.out.println("Student name: Ramesh");
                break;
            case 102:
                System.out.println("Student name: Mahesh");
                break;
            case 103:
                System.out.println("Student name: Mukesh");
                break;

            default:
                System.out.println("Not found Student name");

        }


    }
}
