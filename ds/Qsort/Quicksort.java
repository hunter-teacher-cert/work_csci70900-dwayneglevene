import java.io.*;
import java.util.*;

public class Quicksort{

    public  void quickSort(int[] A){
        quickSort(A,0,A.length - 1);
        //calling quicksort recursively
    //creating the quick sort you take your array with 3 parameters the array it self and its starting and ending point
    // this is because you will be breaking your array into three parts eventually starting, ending and partition

    }

    public void quickSort(int [] A, int low, int high){
        if(low < high + 1){

            //creat a partition of low and or left and right
            int p =partition(A, low, high);
            quickSort(A, low, p - 1);
            quickSort(A, p + 1, high);
        }
    }

    private void swap(int [] A, int index1, int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    private int getPivot(int low,int high){

        //chooses a random pivot index between the low and high values
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    private int partition(int [] A, int low, int high){
        //goes through each value and compares to the pivot sending it either to low or high sides
        swap(A, low, getPivot(low,high));
        int border = low + 1;
        for(int i = border; i <= high; i++){
            if (A[i] < A[low]){
                swap(A,i,border++);
            }
        }

        swap(A,low,border-1);
        return border -1;
    }

    public static void main(String[] args){
        Quicksort qs = new Quicksort();
        int [] A = {2,1,0,9};
        System.out.println(Arrays.toString(A));
        qs.quickSort(A);
        System.out.println(Arrays.toString(A));

    }
}