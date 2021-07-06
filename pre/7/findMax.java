import java.util.io.*;
import java.util.*;
import java.util.Arrays;


public class indexOfMax{
    public static void main(String []args){
        // indexOfMax(arrInt);
    }

    public static int indexOfMax(int arrInt[]){
        int max = arr[0];
        int index = 0;
        for(i =0; i <arrInt.length; i++){
            if(arrInt[i] > max){
                max = arrInt[i];
                index = i;
            }

        }

        return index;
    }
}