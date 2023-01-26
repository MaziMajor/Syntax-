package Class8ForLoop;

public class PracticeBreakKeyWord {
    public static void main(String[] args) {
     boolean summer=true;
     int temp=75;
     while (summer){
         if (temp<=100){
             System.out.println("i love summer because is "+temp);
         }else{
             System.out.println("very hot"+temp);
             break;

         }temp+=5;
     }
        System.out.println("********************************");

           boolean summer1=true;
           int i=75;
           for (i=75; i<=100; i+=5){

               if (i<100){
                   System.out.println("love summer"+i);
               }else{
                   System.out.println("very hot"+temp);
               }
           }
    }
}

