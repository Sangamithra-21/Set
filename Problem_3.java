package Assignment_21_LinkedHashSet_Treeset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Problem_3 {
    public static void main(String[] args) {

        LinkedHashSet<String> list = new LinkedHashSet<>();

        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("yellow");

        String[] arr = new String[list.size()];

        Iterator<String> iterator = list.iterator();
        int i=0;
        while(iterator.hasNext())
        {
            arr[i++]=iterator.next();
        }

        System.out.println("LinkedHashSet to Array : "+(Arrays.toString(arr)));

        LinkedHashSet<String> newList = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println("Array to LinkedHashSet : "+newList);
    }
}
