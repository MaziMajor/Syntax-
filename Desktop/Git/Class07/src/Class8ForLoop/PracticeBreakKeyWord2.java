package Class8ForLoop;

import javax.swing.plaf.IconUIResource;

public class PracticeBreakKeyWord2 {
    public static void main(String[] args) {



        for ( int i=1 ; i<10 ; i++){

            if (i%3==0){
                continue;

            }else{
                System.out.println(i);
            }
            System.out.println("hello java");
        }
    }
}

