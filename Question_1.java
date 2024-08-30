package Assignment_21_LinkedHashSet_Treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Question_1 {
    public static void main(String[] args) {

        TreeSet<Integer> treeList = new TreeSet<>();

        treeList.add(50);
        treeList.add(30);
        treeList.add(20);
        treeList.add(10);
        treeList.add(40);

        System.out.println("Tree Set Elements : ");
        System.out.println(treeList);

        System.out.println("Tree Set Elements : ");
        Iterator<Integer> iterator = treeList.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
    }
}
