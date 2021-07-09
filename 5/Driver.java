import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

//  1   Your driver file should contain code to (in suggested development order)
// 1 instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
// 1 instantiate a newly-created Time object with specified value(s)
// assign a Time var the value null
// assign a Time var the value of an existing Time var
// print all of the above (See multiple ways to do this? Try all -- and document in comments!)
// test for equality of each of the Time instances above. Print results.
// add two Time objects and print results
// add two Time objects and save the result in another Time object

    //declare a var of appropriate type to assign an instance of Time to
    Time t = new Time(); // time object with default values

    //assign var the address of a newly-apportioned Time object
   Time t2 = new Time(11,12,25.9);

    //// assign a Time var the value null
    Time t3 = null;

    //// assign a Time var the value of an existing Time var
    Time t4 = t3;
    //testing if this works for my own sense of mind
    //System.out.println(t4);

    // print all of the above (See multiple ways to do this? Try all -- and document in comments!)
   //getter methods from private class

   String clock1 = t.toString();
   String clock2 = t2.toString();
  //  String clock3 = t3.toString(); null value will throw error trying to convert


   System.out.println(clock1);
   System.out.println(clock2);
   System.out.println(t3);
   //System.out.println(clock3);
 
// What do i need to print this // i need access to the private instance variables.
   
// test for equality of each of the Time instances above. Print results.
System.out.println(t.equals(t2));

// add two Time objects and print results
System.out.println(Time.add(t,t2));
  }//end main()


}//end class