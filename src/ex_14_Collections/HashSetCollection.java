package ex_14_Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
public class HashSetCollection {
    public static void main(String[] args)
    {
        //Declaration
        //HashSet hs = new HashSet();
        Set hs = new HashSet();

        // adding elements
        hs.add(100);
        hs.add(100);
        hs.add(10.5);
        hs.add("program");
        hs.add("java");
        hs.add(true);
        hs.add(false);
        hs.add(null);
        hs.add(null);

        System.out.println(hs);
        // removing elements from HashSet
        hs.remove(100);
        System.out.println(hs);

        //inserting elements
        hs.add("welcome");  //inserting element is possible But, inserting element in particular position is not possible.
        System.out.println(hs);
        System.out.println("************************");

        //accessing specific element is not possible
        //But workaround is possible convert Hashset to ArrayList and then we can access element
        //ArrayList ar = new ArrayList(hs);
        //System.out.println(ar.get(4));

        //read all elements from Hashset
        for(Object a : hs)
        {
            System.out.println(a);
        }
        System.out.println("************************");

        Iterator it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("************************");

        // size od HashSet
        System.out.println(hs.size());
        System.out.println("************************");

        // clearing all elements
        hs.clear();
        System.out.println(hs);
        System.out.println("************************");

        System.out.println(hs.isEmpty());



    }
}
