package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        LinkedList <String> linkedList = new LinkedList<>();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0 ; i < 100000; i++){
            arrayList.add(i + "sd");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (endTime1 - startTime1));


        long startTime2 = System.currentTimeMillis();
        for (int i = 0 ; i < 100000; i++){
            linkedList.add(i + "sd");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("LinkedList add: " + (endTime2 - startTime2));

        long startTime4 = System.currentTimeMillis();
        for (int i = 0 ; i < 100000; i++){
            arrayList.get(i);
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("arrayList get: " + (endTime4 - startTime4));

        long startTime3 = System.currentTimeMillis();
        for (int i = 0 ; i < 100000; i++){
            linkedList.get(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("linkedList get: " + (endTime3 - startTime3));
    }

}
