package homework9;

import java.util.*;

public class Holodilnik implements IHolodilnik {

    private HashMap<String, Integer> products = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Holodilnik)) return false;
        Holodilnik that = (Holodilnik) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Holodilnik{" +
                "products=" + products +
                '}';
    }

    @Override
    public void getProductsInOrder() {
        ArrayList<String> keys = new ArrayList<>(products.keySet());
        Collections.sort(keys);
        for (String key : keys) {
            System.out.println(key + " - " + products.get(key) + " кг ");

        }
    }


    public void putProduct(String product, int value) {
        if (products.containsKey(product)) {
            int currentValue = products.get(product);
            products.put(product, value + currentValue);
        } else {
            products.put(product, value);
        }
    }

    @Override
    public void productWithMaxAmount() {
        int maxValueInMap = (Collections.max(products.values()));  // This will return max value in the Hashmap
        for (Map.Entry<String, Integer> entry : products.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());

            }
        }
    }

    @Override
    public void productWithMinAmount() {
        int minValueInMap = (Collections.min(products.values()));
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() == minValueInMap) {
                System.out.println(entry.getKey());
            }
        }
    }

    @Override
    public void productAmount(String s) {
        if (products.containsKey(s)) {
            int currentValue = products.get(s);
            System.out.println(s + " остался в кол-ве " + currentValue);
        } else {
            System.out.println("Такого продукта нет");
        }
    }


    @Override
    public void getMinSet(int n) {
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
          if(entry.getValue() < n){
              System.out.println(entry);

}else {
              System.out.println("Товар не найден");
              break;
          }
        }
    }
}
