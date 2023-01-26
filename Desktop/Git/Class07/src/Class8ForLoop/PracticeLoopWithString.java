package Class8ForLoop;

import java.util.Scanner;

public class PracticeLoopWithString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name");

        while (scanner.next().equalsIgnoreCase("Shah")){
            System.out.println("great student");

        }
    }
}
