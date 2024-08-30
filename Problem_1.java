package Assignment_21_LinkedHashSet_Treeset;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class Problem_1 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> list = new LinkedHashSet<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        list.add(15);

        System.out.println("List Elements : "+list);

        Iterator<Integer> iterator = list.iterator();
        System.out.println("List Elements : ");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }

    }
}
