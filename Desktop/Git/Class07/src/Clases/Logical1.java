package Clases;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);


       boolean boughtChocolate=true;
       boolean boughtFlowers=true;
       if(boughtChocolate||boughtFlowers){
           System.out.println("im happy");
       }else{
           System.out.println("she will be sad");
       }

    }
}
