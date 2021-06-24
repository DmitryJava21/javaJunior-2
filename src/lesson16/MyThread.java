package lesson16;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<1020;i++) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
