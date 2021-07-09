import java.util.*;
import java.io.*;

public class Time {

  // your implementation of class Time here
  private int hour; // create these instance variables will use them later
  private int minute;
  private double second;

  public Time(){ 
      //this is a constructor for a default time think of it as a character creation window in a video game you can get the standard character if you want to change it it later you have that option in the value constructor

      this.hour = 0;//
      this.minute = 0;
      this.second = 0.0;
  }

//value constructor think of this as the part that created the character mod or think of this as the part that creates a specific time that you want

public Time(int hour, int minute,double second){
  this.hour = hour;
  this.minute = minute;
  this.second = second;
}


//getter methods from private class
 public int getHour(){
   return this.hour;
 }
  
public int getMinute(){
  return this.minute;
}
 
public double getSecond(){
  return this.second;
}

public String toString(){
  return this.hour + ": " + this.minute + ": " + this.second;
}

public boolean equals(Time that){
  return this.hour == that.hour
  && this.minute == that.minute
  && this.second == that.second;
}

public Time add(Time t, Time t2){
  Time sum = new Time();
  sum.hour = t.hour + t2.hour;
  sum.minute = t.minute + t2.minute;
  sum.second = t.second + t2.second;
  return sum;
}

}//end class