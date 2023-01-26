package Clases;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {


        int temp=70;


        while (temp<=105){
            if(temp<=100){
                System.out.println("i love summer");
            }else{
                System.out.println("very hot");
                break;
            }temp+=5;
        }

    }

}
