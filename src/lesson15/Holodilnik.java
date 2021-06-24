package lesson15;

import java.util.HashMap;

public class Holodilnik {
    private HashMap<String, Integer> products = new java.util.HashMap<>();

    public void addProduct(String product, int value) {
        products.put(product, value);
    }

    public void printAllProducts(){
        for(String product:products.keySet()){
            System.out.println(product + " - " + products.get(product));
        }
    }
}
