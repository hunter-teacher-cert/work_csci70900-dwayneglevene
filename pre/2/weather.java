import java.io.*;
import java.util.*;
import java.util.Scanner; //scanner method used to collect infor from user

public class weather{
    public static void main (String[] args){
        double celsius;
        double faren;
        Scanner in = new Scanner(System.in); //in is variable used to store the response to a question
        System.out.println("Hey bro whats the weather in toronto?");
        celsius = in.nextDouble(); //nextInt is a method that turns that scanner resonse into an interger
        faren = celsius * 9.0/5 + 32;

        System.out.println("When converted from Celsius the degrees are :" + celsius + " C = " + faren + " F");
        // nextInt degrees = new nextInt(System.in);

        // int faren = degrees * 9/5 +32;

    }
}