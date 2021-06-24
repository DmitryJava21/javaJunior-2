package lesson16;

public class Veduchiy {
    public static void main(String[] args) {
        System.out.println("Начало концерта!" + " " + Thread.currentThread().getName());
        Pevec1 pevec1 = new Pevec1();
        Pevec2 pevec2 = new Pevec2();
        pevec2.setDaemon(true);
        pevec1.start();
        pevec2.start();

        while (pevec1.isAlive()) {

        }

        System.out.println("Концерт окончен!" + " " + Thread.currentThread().getName());
    }
}
