
import java.io.*;
import java.util.*;


// this is the creation of your node and allow for going forward and backwards
public class Node{
    private String data;
    private Node prev; //<-----
    private Node next; //---->
    

public Node(){
    //default constructor
    data = "";
    prev = null;
    next = null;
    
}
public Node(String value){
    data = value;
    prev = null;
    next = null;
    //value constructor
}

 public Node(String value,Node prev,Node Next){
     data = value;
     this.prev = prev;
     this.next = next;
     //value constrctore
 }

///set data
//set next

//get data
//get next

//to string method
 
    public void setData(String value) {
	     data = value;
    }//setData

    public void setPrev(Node n){
        prev = n;
    }

    public void setNext(Node n) {
	     next = n;
    }//setNext

    public String getData() {
	     return data;
    }//end getValue

    public Node setPrev(){
        return prev;
    }

    public Node getNext() {
	     return next;
    }//getNext

    public String toString() {
	     return data;
    }//toString



 }