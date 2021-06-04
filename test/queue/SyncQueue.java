package test.queue;

public class SyncQueue {
    int n;
    boolean flag = false;

    synchronized int put(int n) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пиьсмо " + n + " отправлено/получено");
        flag = true;
        this.n = n;
        notify();
        return n;
    }

    synchronized  void get() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Письмо " + n + " доставлено");
        flag = false;
        notify();
    }
}
