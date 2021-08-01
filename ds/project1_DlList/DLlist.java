import java.util.*;
import java.io.*;

//create your doubly linked list class

///this is where you construct the list this has no powere in creating a node to go on the list 
public class DLlist{
    private Node front;
    private Node back;

    public DLlist(){
        front= null;
        back = null;
    }

     // Add a new node containing data
    // at the front of the list
  public void addFront(String data){// creating a function that takes the data type string data
      //creating new node called front
	
  	Node newFront= new Node(data); //Creating a new node called new Front that is given the data info
	// point it to what front points to
    newFront.setNext(front);
    // newFront now jumps to the top of the list and the front gets pushed to the next item in the list it is still null
	// point front to the new node
    front = newFront;

 }//end addFront


 //add back prev
 public  void addBack(String data){
     Node newBack = new Node(data);
         newBack.setPrev(back);
         back = newBack;

     
 }
// cannot point to item when empty
 public String toString(){
    Node currentNode; // creating a new node called current node
    currentNode = front;
    String result = "";
    while (currentNode != null){ // while your furrent node or first node inst empty that means you linked list is not emply and you can add them to the string result
        result = result + currentNode;
        // this is like i=i+1 is for arrays
        // but for linked lists 
        currentNode = currentNode.getNext();// the next node after each current node is the new current node
    }

	result = result + " null";
	return result;
    // the is an else that stops the listing if the while is true and current node is empty
    }


}

//goal add, remove