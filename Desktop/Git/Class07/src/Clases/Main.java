package Clases;

public class Main {
    public static void main(String[] args) {
        boolean workday=true;
        int day=1;

        while(workday){
            if(day<=2){
                System.out.println("i need a day off");
            }else{
                System.out.println("i do not need day off anymore");
                workday=false;
            }day++;
        }


    }
}