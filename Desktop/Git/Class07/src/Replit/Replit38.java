package Replit;

import java.util.Scanner;

public class Replit38 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean weekend=scan.nextBoolean();

        if(!weekend){
            System.out.println("Today you will be learning manual testing");
        }else{
            System.out.println("Today you will be learning java");
        }

}}
