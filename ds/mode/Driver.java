import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
	// Mode m = new Mode();

	// System.out.println(m);
  // int smallestValue = m.findSmallestValue();
  // System.out.println(smallestValue);
  // int v = m.frequency(6);
  // System.out.println( "6 appears in your data set " + v + " times.");
  // int numMode = m.calcMode();
  // System.out.println("The mode of this data set is " + numMode);


  long start;
  long elapsed;
	int size;

	// size = 200000;
	// SortDemo sds = new SortDemo(size);
	// start = System.currentTimeMillis();
	// sds.sort();
	// elapsed = System.currentTimeMillis() - start;
	// System.out.println("Selection on size " + size + " : " + elapsed);

	Mode m = new Mode();
	start = System.currentTimeMillis();
  System.out.println(start);
	int m1 = m.calcMode1();
	elapsed = System.currentTimeMillis() - start;
	System.out.println("The mode of this data set is " + m1 + " : " + elapsed);

	Mode mCheck = new Mode();
	start = System.currentTimeMillis();
	int m2 = mCheck.calcMode2();
	elapsed = System.currentTimeMillis() - start;
	System.out.println("The mode of this data set is " + m2 + " : " + elapsed);

    }

}
