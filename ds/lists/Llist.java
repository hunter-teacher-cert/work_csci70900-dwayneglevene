// Started with Jyhoon and Diana
// went to ian,eric and peter 

import java.io.*;
import java.util.*;

//creating a class
public class Llist{
    //creating the private variable constructor
    private Node front; // the front of the list

 public  Llist(){
     //default constructor a node with no vslue also not connected with anything so its not yet a linked list
	front = null;
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

     public boolean isEmpty(){
	return front==null; // could also return !front
    }

    // returns the number of items in the list
    // Hint: look at the toString
    // to remind you how to traverse down the list
    public int length(){
	Node currentNode = front; // always start at the front
	int count = 0; // the counter
	while (currentNode != null){
	    count = count + 1; // incremtnt if current node is not null
	    currentNode = currentNode.getNext(); //get the next after currtent node and set it to become the new current node
        //
	}
	return count;
    }

    // returns the item at location index;
    // returns null if there aren't enough
    // items. Starts with index 0
    public String get(int index){
	// be careful not to run off the end of the list
	// move a reference to the node we want to get
	// traverse idiom
	int count = 0;
	Node currentNode = front;
	while (currentNode != null && count != index){
	    currentNode = currentNode.getNext();
	    count = count + 1;
	}
	
	// once there, return the data in that node
	if (currentNode == null){
	    return null;
	} else {
	    return currentNode.getData();
	    
	}
	
	
    }

    // sets the item at location index (starting
    // with 0) to value.
    // only sets if the index is within range
    public void set(int index, String value){

	int count = 0;
	Node currentNode = front;
	while (currentNode != null && count != index){
	    currentNode = currentNode.getNext();
	    count = count + 1;
	}
	
	// once there, set the new data
	if (currentNode != null){
	    currentNode.setData(value);
	}


    }

    // insert an item before index.
    // only inserts if the index is within bounds
    // Hint: look at toString for hints on
    // traversal and draw out a diagram.
    // You will need a variable that refers to
    // the node BEFORE you want to do the insertion.
    public void insert(int index, String value){

    }

    // returns the index of the first item with
    // data value key. Returns -1 if not found
    public int search(String key){
	return -1;	
    }

    // removes the node at index.
    // does nothing if index out of bounds
    public void remove(int index){
        int count= 0;
        Node currentNode = front;
       
       Node priorNode = front;
    while (currentNode != null){
        
         if (count == index -1){
            currentNode.setNext(currentNode.getNext().getNext());
//  i have a list ;ike 1 , 2 , 4 , 5,
// i can tell current not 2 that its next will be 5 and that will chnage it and skip 4
        }
        count++;

        currentNode = currentNode.getNext();
    }
	
    }

}