import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
	Mode m = new Mode();

	System.out.println(m);
  int smallestValue = m.findSmallestValue();
  System.out.println(smallestValue);
  int v = m.frequency(6);
  System.out.println( "6 appears in your data set " + v + " times.");
  int numMode = m.calcMode();
  System.out.println("The mode of this data set is " + numMode);
    }

}
