package lesson15;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Яблоко", 5);
        holodilnik.addProduct("Груша", 3);
        holodilnik.addProduct("Слива", 2);
        holodilnik.addProduct("Яблоко", 7);
        holodilnik.printAllProducts();
    }
}
