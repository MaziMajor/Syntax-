package Class9ForLoop;

import java.util.Scanner;

public class Practice02RRRR {
    public static void main(String[] args) {
        /*
        * creat a program that will be asking print 10
        * times his redit card,
        * if yes program should stop asking*/

        Scanner scanner=new Scanner(System.in);
        for (int i=0 ; i<10 ; i++)
        System.out.println("apply the credit card 10 times");
        String userinput=scanner.next();

        if(userinput.equalsIgnoreCase("yes")){

        }



    }
}
