package Assignment_21_LinkedHashSet_Treeset;


import java.util.LinkedHashSet;

public class Problem_2 {
    public static void main(String[] args) {

        LinkedHashSet<Character> list = new LinkedHashSet<>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        System.out.println("Before removing C  : "+list);
        list.remove('C');

        System.out.println("After removing C   : "+list);
    }
}
