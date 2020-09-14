package homework8;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        String str = Integer.toString(i);
        System.out.println(str);


        SortedSet sorted = new TreeSet();
        sorted.add(new Integer(2));
        sorted.add(new Integer(3));
        sorted.add(new Integer(1));
        System.out.println(sorted);

    }
}
