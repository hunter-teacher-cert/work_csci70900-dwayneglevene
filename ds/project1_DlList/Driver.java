import java.io.*;

import java.util.*;

public class Driver{
    public static void main(String[] args) {
        Node n = new Node();
        n.setData("Dwayne");
        Node n2 = new Node();
        n2.setData("LEvene");
        
        n.setNext(n2);
        n2.setPrev(n);

        System.out.println(n);
        System.out.println(n2);
        System.out.println(n.getNext());
        
        System.out.println(n2.getPrev());


          DLlist berryList = new DLlist();
          berryList.addFront("Woah");
          berryList.addFront("ok");
          berryList.addBack("pp");
          System.out.println(berryList);


    }
}


