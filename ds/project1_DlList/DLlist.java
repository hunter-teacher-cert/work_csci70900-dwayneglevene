import java.util.*;
import java.io.*;

//This java file is responsible for putting you list together
public class DLlist{
    //instance variables of the nodes you created in your node file
    private Node front;
    private Node back;

    public DLlist(){
        // here is where you actually give them values currently they are null
        front= null;
        back = null;
    }

    //Creating a addFront method/Function that puts nodes down one after the other 
    //the DLL starts with front which is a null value but newNode becomes the new node in the front fo the list everytime addFront is called
    //Thus allowing new Node to continuously be updated to become ht enew front whill the previous front gets pushed down
    public void addFront(String data){
    // make the new node
    Node newNode = new Node(data); // new Node is created here

    // only point the back to the node at the back of the dlist
    //If front equals node which it currently does; back becomes the new Node, front and back are still not connected 
    if (front == null) {
      back = newNode;
    }

    newNode.setNext(front);//Front and back connect here
    //point the newNode's prev to null
    newNode.setPrev(null);
    //as long as the front points to a node, the current front' prev field points to the newNode
    if (front != null) {
      front.setPrev(newNode);
    }
    // point front to the new node
    front = newNode; // not quite getting this one
  }
 
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

//take a location in the linked lists and sets a new value to that node location
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

//goal add, remove

// https://www.geeksforgeeks.org/doubly-linked-list/