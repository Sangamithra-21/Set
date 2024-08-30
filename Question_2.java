package Assignment_21_LinkedHashSet_Treeset;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Question_2 {
    public static void main(String[] args) {

        Comparator<String> len = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int length = Integer.compare(o1.length(), o2.length());
                if (length != 0) {
                    return length;
                } else {
                    return o1.compareTo(o2);
                }
            }
        };

        TreeSet<String> treeSet = new TreeSet<>(len);

        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("cherry");
        treeSet.add("date");

        System.out.println(treeSet);


    }
}
