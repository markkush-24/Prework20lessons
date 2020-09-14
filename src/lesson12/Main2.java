package lesson12;

import java.util.Iterator;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList <String> strings = new LinkedList<>();
        strings.add("fafd");
        strings.add("www");
        strings.add("eeee");
        strings.add("rrrr");
        strings.add("tttt");
       // System.out.println(strings.toString());
        // 1 - стандартный цикл фор
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
// 2 - foreach
            for (String s: strings) {
                System.out.println(s);
                // 3 - с помощью итератора
                for(Iterator<String> iterator = strings.iterator();iterator.hasNext();){
                    System.out.println(iterator.next());

                }
            }
        }
    }
}
