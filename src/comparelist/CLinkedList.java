package comparelist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CLinkedList {
      public static void main(String[] args) {
       List <Integer> myLinkedList=new LinkedList<>();
       Random rand=new Random();
       for(int i=1;i<=100000;i++){
           int value=rand.nextInt(100);
           myLinkedList.add(value);}
           System.out.println("My linked list is: "+myLinkedList);
      System.out.println("My ArrayList is: "+myLinkedList);
       for(int i=1;i<10000;i++){
       Random r1=new Random();
       int randIndex=rand.nextInt(myLinkedList.size());
       int getValue=myLinkedList.get(randIndex);
           System.out.println("Random index:"+randIndex+" value:"+getValue);
       }
           System.out.println();
       for(int i=1;i<10000;i++){
       Random r1=new Random();
       int randValue=rand.nextInt(100);
       int randIndex=rand.nextInt(myLinkedList.size());
       myLinkedList.set(randIndex,randValue);
           System.out.println("Random index:"+randIndex+" was set as value:"+myLinkedList.get(randIndex));
       }
      
      
      }     
}
