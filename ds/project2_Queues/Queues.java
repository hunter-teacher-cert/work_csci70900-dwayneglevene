import java.util.*;
import java.io.*;


public class Queues{
    private Node head;
    private Node tail;
    private String data


    public Queues(){
        head = null;
        tail = null;
        private String data;

    }

    public void add(String data){
    Node node = new Node(data);
    if(tail != null){
        tail.next = node;
    }
    tail = node;
    if (head == null){
        head = node;
    }


}

}

//  private static class Node{
//     private int data;
//     private Node next;

//     private Node(int data){
//         this.data = data;

//     }
//  }

//  private Node head;
//  private Node tail;

// public boolean isEmpty(){
//     return head == null;
// }
// public int peek(){
//     return head.data;
// }
// public void add(int data){
//     Node node = new Node(data);
//     if(tail != null){
//         tail.next = node;
//     }
//     tail = node;
//     if (head == null){
//         head = node;
//     }
// }
// public int remove(){
//     int data = head.data;
//     head = head.next;
//     if(head == null){
//         tail = null;
//     }
//     return data;
// }