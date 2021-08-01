
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

 
    public void setData(String value) {
	     data = value;
    }//setData

    //this manually sets your previous node , should try to make it automatic
    public void setPrev(Node n){
        prev = n;
    }

    //sets your next node
    public void setNext(Node n) {
	     next = n;
    }//setNext

    //grabs the data you want to jnow
    public String getData() {
	     return data;
    }//end getValue

    //gets the previous node
    public Node getPrev(){
        return prev;
    }
    //gets the next node

    public Node getNext() {
	     return next;
    }//getNext

    public String toString() {
	     return data;
    }//toString



 }