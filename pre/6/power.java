import java.util.*;
import java.io.*;

public class power{
    public static void main (String[] args){
        System.out.println(dubPow(6,2)); // call the function
    }

    public static double dubPow(double x,int n){// takes a double and int is a a param to use later
        for(int i = 1; i <= n;i++){// iterating through the amount of n it i is less or equal to n
           double test=  x * Math.pow(x,n-1); //Math.pow is a how you use exponnt in java 1st value is base second value is exponent
            return test;// the result is save in test which is then converted to a double
        }
        return 1;// i dont een think i need this lol
    }
}