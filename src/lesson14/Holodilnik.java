package lesson14;

import java.util.HashMap;

public class Holodilnik {
    private HashMap<String,Integer> produkts = new HashMap<>();



    public void putProduct(String product , int value) {
        if (produkts.containsKey(product)) {
            int currentValue = produkts.get(product);
            produkts.put(product, value + currentValue);
        } else {
            produkts.put(product, value);
        }
    }
        public void getProduct (String product , int value) {
            if (produkts.containsKey(product)) {
                if (value > produkts.get(product)) {
                    System.out.println("Такого кол-ва " + product + " нет в холодильнике");
                }else {
                    int currentValue = produkts.get(product);
                    produkts.getOrDefault(product, currentValue - value);
                }
            } else {
                System.out.println("Продкукта нет");


        }


    }

    public void printAllProdukts(){
       for(String key: produkts.keySet()){
           System.out.println(key + " - "+ produkts.get(key) + " кг ");
       }
    }

    public void PrintAllNetto(){
        int sum = 0 ;
        for(String key: produkts.keySet()){
            sum = sum + produkts.get(key);
        }
        System.out.println(sum);
    }
}
