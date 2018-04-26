package tools;
import java.util.Scanner;

public class InputScanner {

    java.util.Scanner input = new java.util.Scanner(System.in);

    public int setRunTime() {
        System.out.print("PLEASE ENTER TIME SCRIPT NEEDS TO RUN FOR IN MINUTES: ");
        return input.nextInt();
    }

    public int setNumberofCoins(){
        System.out.print("PLEASE ENTER HOW MANY COINS YOU HAVE: ");
        return input.nextInt();
    }
}
