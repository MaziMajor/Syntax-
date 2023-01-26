package Replit;

import java.util.Scanner;

public class Replit36 {
    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);

        System.out.println("please enter two string");
        String string1= scan.nextLine();
        String string2= scan.nextLine();

        System.out.println("please enter two number");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        if (num1==num2&&string1==string2){
            System.out.println("AND");
        }else if (num1==num2||string1==string2){
            System.out.println("OR");
        } else if (num1!=num2&&string1!=string2) {
            System.out.println("NON");

        }


    }
}
