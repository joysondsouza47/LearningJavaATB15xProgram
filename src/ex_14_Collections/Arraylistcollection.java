package ex_14_Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Arraylistcollection {

    public static void main(String[] args)
    {
        //Declaration // initial capacity can also be given
        ArrayList ar = new ArrayList(2);
        List ar1 = new ArrayList();
        ar.add(100);
        ar.add(10.5);
        ar.add(200);
        ar.add(200);
        ar.add("welcome");
        ar.add(true);
        ar.add(null);
        ar.add(null);

        // print all elements from ArrayList
        System.out.println(ar);
        System.out.println("............................");
        // size of the ArrayList
        System.out.println(ar.size());
        System.out.println("............................");
        // remove element from ArrayList using index
        System.out.println(ar.remove(3));
        System.out.println(ar);
        System.out.println("............................");
        try{
            System.out.println(ar.remove(30));
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("handled exception");
            System.out.println(e.getMessage());
        }
        System.out.println("............................");

        // insert element in the arraylist
        ar.add(3,"java");  //this will add element in between the elements
        System.out.println(ar);
        System.out.println("............................");

        //remove element from ArrayList using index
        ar.remove("java");
        System.out.println(ar);
        System.out.println("............................");

        //modify element in the ArrayList
        ar.set(3,"welcomejoy");
        System.out.println(ar);
        System.out.println("............................");

        //access specific element from ArrayList
        System.out.println(ar.get(1));
        System.out.println("............................");

        //reading all the element from ArrrayList
        //approach: 1
         for (int i=0; i<ar.size(); i++)
         {
             System.out.println(ar.get(i));
         }
        System.out.println("............................");
         //Approach: 2
         for(Object a : ar)
         {
             System.out.println(a);
         }
        System.out.println("............................");
         //approach: 3
        Iterator it = ar.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("............................");
        // checking ArrayList is empty or not
        System.out.println(ar.isEmpty());
        System.out.println("............................");

        //remove all elements from ArrayLit
        ar.clear();
        System.out.println(ar);
        System.out.println("............................");
        System.out.println(ar.isEmpty());





    }
}
