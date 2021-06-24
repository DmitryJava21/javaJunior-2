package lesson16;

public class Pevec2 extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Monitores.MICROPHONE) {
                try {
                    Monitores.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 2; i++) {
                System.out.println("----------------фа" + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitores.MICROPHONE) {
                Monitores.MICROPHONE.notifyAll();
            }
        }
    }
}
