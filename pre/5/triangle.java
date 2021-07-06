import java.util.*;
import java.io.*;




public class triangle{

    public static void main(String[] args){
        System.out.println(perfTriangle(4,8,9));
    }
    public static boolean perfTriangle(int s1,int s2,int s3){
        if(s1 != s2 || s1 != s3){
            System.out.println("You cant be a triangle family");
            return false;
        }
        System.out.println("I always new you would be a triangle");
    return true;

    }
}