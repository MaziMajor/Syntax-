package Reveiw3;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter your browser");
        String browser=scan.nextLine();

        switch (browser){
            case "chrome":
                System.out.println("tes");
        }
    }
}
