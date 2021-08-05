import java.util.*;
import java.io.*;

public class Node{
    private String data;
    private Node next;

    public Node(){
        data= "";
        next = null;
    }

    public Node(String value){
    data = value;
    //prev = null;
    next = null;
    //value constructor
}

 public Node(String value,Node Next){
     data = value;
    // this.prev = prev;
     this.next = next;
     //value constrctore
 }

   public void setData(String value) {
	     data = value;
    }//setData

 //sets your next node
    public void setNext(Node n) {
	     next = n;
    }//setNext

     public Node getNext() {
	     return next;
    }//getNext

     public String toString() {
	     return data;
    }//toString

}