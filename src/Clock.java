import java.util.Scanner;

public class Clock {

    public static void main(String[] args) {

         System.out.println("\t\t\tВведите количество секунд: ");

         int total_seconds = new Scanner(System.in).nextInt();
         int hours = total_seconds/3600;
         int minutes = (total_seconds - hours*3600)/60;
         int seconds = (total_seconds-(hours*3600)-minutes*60);
         
         System.out.println("\t\tCURRENT TIME: hours "+hours+" minutes "+ minutes+" seconds "+seconds);


    }
}
