
import java.util.*;
import java.io.*;

//exercisie 4

//basically any number that goes in as you parameter make a for look that multiplies that number by the previous numbers that come before it
//for ex int 5 would be 5*4*3*..... but do it using a loop
public class factorial{
    public static void main(String[] args){
        System.out.print(myFact(5)); // called my function of factorials
    }


     // we art starting our oteration at 1 
      //  because the concept of factorial would be 
      //  mulitiplacation so we dont want to multiply 0 it would lead to error
    // if iteration is less or equal to the chosen number we keep finindg the factorial the moment it goes over we stop

    save the mathemeatical equation for factorial in test and return that to our function
    call that in our main
    public static int myFact(int n){
        for(int i=1;i <= n; i++){ 
            int test = n*(n-1);
            return test;
        }
        return 1;// is it necessary to have this dummy text
    }

}