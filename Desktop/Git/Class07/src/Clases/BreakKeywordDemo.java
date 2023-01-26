package Clases;

public class BreakKeywordDemo {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=70;


        while (summer){
            if(temp<=100){
                System.out.println("i love summer");
            }else{
                System.out.println("very hot");
                break;
            }temp+=5;
        }

    }

}
