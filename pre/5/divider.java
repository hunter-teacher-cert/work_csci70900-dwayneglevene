import java.util.*;
import java.io.*;

public class divider{

    public static void main(String [] args){
        System.out.println(isDivisible(6,8));
    }
    

    public static boolean isDivisible(int n, int m){
        if(n % m == 0){
            return true;
        }
        
       return false;
    }
}