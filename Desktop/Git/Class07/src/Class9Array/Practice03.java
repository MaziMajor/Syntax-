package Class9Array;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        /*
        * write program that read a range og integers(start point
        * )' provide by a user and then from that range
        * points the sum of the even and odd integers*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter two numbers starting point and ending point");

        int start=scanner.nextInt();
        int end=scanner.nextInt();

        System.out.println("start "+start+" end "+end);

        int evenSum=0;
        int oddSum=0;

        for (int i= start ; i<= end ;i++){
            if (i%2==0){
                evenSum+=i;

            }
        }



    }
}
