import java.io.*;
import java.util.*;

/**
 * Team 4
 * Dwayne Levene
 * Eduardo Leite
 * Eric Liu tyl3452 tayou.liu@gmail.com
 */

/*
Setup:
 1.Make a folder under your work repo named: ds
 2. Make another folder under that named sort1
 3. Copy this file and SortDemoDriver.java into the ds/sort1 folder
 
Lab:
Part 1:  
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortDemoDriver.java and SortDemo.java) and confirm
   the behavior of the constructors.
Part 2:
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortDemoDriver to test.
Part 3:
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortDemoDriver to test.
*/

public class SortDemo{

    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    private Random r; 

    //constructor loops 15 times to create a default array with 15 elements that are randome numbers from 1 to 19, 20 exclusive
    public SortDemo(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}
	
    }
    
    //Construct arraylist of target size with random numbers from 0 to 20 (exclusive)
    public SortDemo(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }

// public int get(int index){
//   return this.data.get(index);
// }
    /*
      return the index of the ArrayList data from index start to the end
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
      6 which is the index with the smallest value from start to end
    */
    public int findSmallestIndex(int start){
      int smallIndex = start;
      //int smallestValue = data[start];
      //for loop loop iterates from start  and sees if i is less that the size of the array list
     // if so if the current position is less that the start the new smalles index is the current i, it keeps track of the smallest i
      for(int i=start+1; i<data.size(); i++){
        if(data.get(i) < data.get(smallIndex)) {
          smallIndex = i;
        }
      }//end for
      
      // start a variable at the one after start
      // your code here
      
      // loop from that variable to end and update smallIndex as needed
      // your code here
	
	    return smallIndex;

    }


    
    public void sort(){
      int i;
      int smallIndex;
      int tempInt;
      for (i=0;i < data.size()-1; i++){
          // find the smallet index from i to end
          // your code here
          smallIndex = findSmallestIndex(i);

          // swap the item at that index and i
          // your code here
          tempInt = data.get(smallIndex);
          data.set(smallIndex, data.get(i));
          data.set(i, tempInt);
          
      }
    }



    /* If you finish the lab early you can get started on this */
    public int linearSearch(int value){
      // loop through the ArrayList data
      // and if the value you're searchign for is in the ArrayList, return it.
      // return -1 if it isn't there.
      
	
	    return 0; // replace this return
    }
    
    /* If you finish the lab early you can get started on this */
    public int binarySearch(int value){
      boolean replacethiswithrealexpression=false;
      int lowerIndex = 0;
      int upperIndex = data.size();
      int middleIndex = data.size()/2;
      
      //sd.binarySearcg(5)
      /* if upper crosses lower it's not there and the lop should exit the loop
        and if the item is at middle you should exit the loop
        
              you have to replace the "replacethiswithrealexpression" boolean 
              with a correct expression based on lowerIndex and upperIndex
      */
      while (replacethiswithrealexpression)
          {
        // update lower and upper.
        // remember if value is less than data.get(middleIndex) you want to search next time
        // from lower to the middle and otherwise from the middle to the upper.
        //
        // then update middleIndex based on new lowerIndex and upperIndex.
          
          }
      
      /* replace this return to either return the value if it was found and -1
        if upperIndex and lowerIndex crossed
      */    
      
      return 0; // replace this return
    }
    
	
    public String toString(){
	    return ""+data;
    }

    //added to be able to access in driver file
    public int get(int index) {
        return data.get(index);
    }




// Preconditions: a and b are ArrayLists of Integers and
  //                both are in increasing order
  // Return: a new ArrayList of Integers that is the result
  //         of merging a and b. The new ArrayList
  //         should be in increasing order
  private ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
    ArrayList<Integer> c = new ArrayList<Integer>();//create the new array list that will contain the merged data
    int i = 0; //index for ArrayList a
    int j = 0; //index for ArrayList b
    while(i < a.size() && j < b.size()){//loop until you reach the end of BOTH arraylists
      if (a.get(i) < b.get(j)){
        c.add(a.get(i));
        i++;
      } else{
        c.add(b.get(j));
        j++;
      }//if statement to compare elements in arraylists
    }//end of while loop
    return c;
  }//end of merge


/*
    Parameters: l - an ArrayList

    Returns: a new, sorted ArrayList

    This routine should implement the mergesort algorithm.
  */
  public ArrayList<Integer> msort(ArrayList<Integer> l){
    ArrayList<Integer> left = null;
    ArrayList<Integer> right = null;

  // base case - if the input ArrayList is smaller than 2 elements
    //if ArrayList has 0 or 1 elements, return it!
    if(l.size() < 2){
      return l;
    }

  // split l into left and right halves
  left = new ArrayList<Integer>(l.subList(0, l.size()/2));
  //System.out.println(left);
  // sort the right half
  right = new ArrayList<Integer>(l.subList(l.size()/2, l.size()));
  //System.out.println(right);
  // merge the two halves that have been sorted
  return merge(msort(left), msort(right));
  // return the result
    }

  public void msortTest(){
    System.out.println("Here is the original data, pre-msort");
    ArrayList<Integer> test = fillForMergeSort(31);
    System.out.println(test);
    System.out.println();
    test = msort(test);
    System.out.println("Here is the sorted data, post-msort");
    System.out.println(test);
  }

  /*
  * This method takes as input an int and returns an arraylist of corresponding size.
  * This arraylist is already sorted, since it is created by first generating a random number
  * between 0 and 9, then adding another random number between 0 and 9 to that number to create the
  * following term; hence, every term is larger than the term that precedes it.
  */
  private ArrayList<Integer> fillForMerge(int size){
  	ArrayList<Integer> a = new ArrayList<Integer>();
  	int lastVal = r.nextInt(10);
  	for (int i = 0 ; i < size ; i++){
  	    a.add(lastVal);
  	    lastVal = lastVal + r.nextInt(10);
  	}
  	return a;

  }//end of fillForMerge

  //generates random numbers for arraylist to test the mergesort
  private ArrayList<Integer> fillForMergeSort(int size){
    ArrayList<Integer> a = new ArrayList<Integer>();
    int lastVal = r.nextInt(10);
    for (int i = 0 ; i < size ; i++){
        a.add(lastVal);
        lastVal = r.nextInt(10);
    }
    return a;

  }//end of fillForMerge


  public void testMerge(){
    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> b = new ArrayList<Integer>();
    a = fillForMerge(20);
    b = fillForMerge(20);
    System.out.println("Here are two sorted ArrayLists, ready to be merged:");
    System.out.println("a[]: " + a);
    System.out.println("b[]: " + b);
    System.out.println();
    System.out.println("Now, here is the merged ArrayList, using merge:");
    System.out.println(merge(a, b));
    System.out.println();
    System.out.println("And here is the merged ArrayList, using altMerge:");
    //System.out.println(altMerge(a, b));
  }//end of testMerge


}//end of class
