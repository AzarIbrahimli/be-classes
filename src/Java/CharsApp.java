package Java;

import java.io.PrintStream;
import java.util.Scanner;

public class CharsApp {
    public static void main(String[] args){
        System.out.println();
        PrintStream out = System.out;
        out.println();
        Scanner sn = new Scanner(System.in);
        out.println("Enter your name: ");
        String myName = sn.nextLine();
        int age = sn.nextInt();
        out.println("Hello, " + myName);
        out.println("My age is " + age);
        String ageInString = sn.next();
        int parseFromString = Integer.parseInt(ageInString) +10;
        out.println(parseFromString);


    }
}
