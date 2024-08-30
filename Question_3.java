package Assignment_21_LinkedHashSet_Treeset;

import java.util.TreeSet;

public class Question_3 {
    public static void main(String[] args) {

        TreeSet<Double> treeSet = new TreeSet<>();
        treeSet.add(1.1);
        treeSet.add(2.2);
        treeSet.add(3.3);
        treeSet.add(4.4);
        treeSet.add(5.5);

        System.out.println("First Element                     : "+treeSet.first());
        System.out.println("Last Element                      : "+treeSet.last());
        System.out.println("Smallest element greater than 3.3 : "+treeSet.higher(3.3));
        System.out.println("Largest element smaller than 3.3  : "+treeSet.lower(3.3));
    }
}
