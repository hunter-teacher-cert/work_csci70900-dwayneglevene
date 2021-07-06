import java.util.Arrays;
import java.util.*;
import java.io.*;

// for (int i = 0; i < a.length; i++) {
//     a[i] = Math.pow(a[i], 2.0);
// }
//starting with thise code take this array and retrun and array with everything squared
//
// Starting with the code in Section 8.6, write a method called powArray that takes a double array, a, and returns a new array that contains the elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power.

public class Array{
    public static void main (String[] args){
        // powArray('{10, 20, 30, 40}',2);

    }

    public  static double[] powArray(double[] a,double x){
        //create an array
        //a = new double[5];
        //create a new array
        double[] newArray = new double[a.length];
        //for every item in a set it equal to our new array and math.Pow by exponent choice
        for(int i = 0; i < a.length; i++){
            newArray[i] = Math.pow(a[i],x);
            // System.out.print(b);
        }
            return newArray;


    }
}