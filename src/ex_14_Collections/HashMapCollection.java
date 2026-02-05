package ex_14_Collections;
import java.util.*;

public class HashMapCollection {
    public static void main(String[] args)
    {
        HashMap hm = new HashMap();
        //Map hm = new HashMap();

        hm.put(101,"joyson");
        hm.put(102,"smith");
        hm.put(101,"don");
        hm.put(104,"deepak");
        hm.put(102,"will smith");


        System.out.println(hm);

        // size
        System.out.println(hm.size());

        //remove pair
        hm.remove(103);
        System.out.println(hm);

        // access value of the key
        System.out.println(hm.get(104));

        // get all the values of the keys
        System.out.println(hm.values());
        // get all keys
        System.out.println(hm.keySet());
        // get all values and keys
        System.out.println(hm.entrySet());

        hm.put(105,"Dsouza");
        System.out.println(hm);
        System.out.println("----------------------------");

        //read data from hashmap
        // using for each loop
        for (Object k : hm.keySet())
        {
            System.out.println(k+" "+hm.get(k));
        }
        System.out.println("----------------------------");

        //iterator

        Iterator it=hm.entrySet().iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("----------------------------");
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println("---------------END-----------------");

    }
}
