package comparelist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author leyla
 */
public class CArrayList {

       public static void main(String[] args) {
       List<Integer> myArrayList=new ArrayList<>();
       Random rand=new Random();
       for(int i=1;i<1000000;i++){
           int value=rand.nextInt(100);
           myArrayList.add(value);
       }
           System.out.println("My ArrayList is: "+myArrayList);
       for(int i=1;i<10000;i++){
       Random r1=new Random();
       int randIndex=rand.nextInt(myArrayList.size());
       int getValue=myArrayList.get(randIndex);
           System.out.println("Random index:"+randIndex+" value:"+getValue);
       }
           System.out.println();
       for(int i=1;i<10000;i++){
       Random r1=new Random();
       int randValue=rand.nextInt(100);
       int randIndex=rand.nextInt(myArrayList.size());
       myArrayList.set(randIndex, randValue);
           System.out.println("Random index:"+randIndex+" was set as value:"+myArrayList.get(randIndex));
       }
    
}}
