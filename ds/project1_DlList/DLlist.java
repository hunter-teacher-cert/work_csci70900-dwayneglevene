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

    public void addFront(String data){
    // make the new node
    Node newNode = new Node(data);

    // only point the back to the node at the back of the dlist
    if (front == null) {
      back = newNode;
    }

    // point it to what front points to
    newNode.setNext(front);
    //point the newNode's prev to null
    newNode.setPrev(null);
    //as long as the front points to a node, the current front' prev field points to the newNode
    if (front != null) {
      front.setPrev(newNode);
    }
    // point front to the new node
    front = newNode; // not quite geeting this one
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


 }

//goal add, remove

// https://www.geeksforgeeks.org/doubly-linked-list/