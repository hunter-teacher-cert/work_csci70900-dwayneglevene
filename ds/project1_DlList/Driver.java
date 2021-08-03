import java.io.*;

import java.util.*;

public class Driver{
    public static void main(String[] args) {
        // Node n = new Node();
        // n.setData("Dwayne");
        // Node n2 = new Node();
        // n2.setData("LEvene"); 
        
        // n.setNext(n2);
        // n2.setPrev(n);

        // System.out.println(n);
        // System.out.println(n2);
        // System.out.println(n.getNext());
        
        // System.out.println(n2.getPrev());


          DLlist musicGroups = new DLlist();
          // musicGroups.addBack("IMX");
           musicGroups.addFront(" B2K ");
           musicGroups.addFront(" B5 ");
            musicGroups.addFront(" 112 ");


           musicGroups.addFront(" Nsync ");¸¸¸
           musicGroups.addFront(" BackStreetBoys "); 
           musicGroups.addFront(" IMX ");
            System.out.println("This is the list of music Groups from the early 2000s");
           System.out.println(musicGroups);
           
            System.out.println("Lets remove a group from the 1st index");

           musicGroups.remove(1);
         System.out.println(musicGroups);

            System.out.println("How long is the list now?");

           System.out.println(musicGroups.length());

            System.out.println("What group is at the zero index?");

           System.out.println(musicGroups.get(0) );
                        
            System.out.println("Lets change group 4 to Usher");

           musicGroups.set(4,"Usher");

          System.out.println(musicGroups);
           

//Working add, remove,get, set method/ lnd 
    }
}


