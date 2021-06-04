package test.queue;

public class Receiver implements Runnable {
    SyncQueue queue;

    public Receiver(SyncQueue queue) {
        this.queue = queue;
        new Thread(this,"Получатель").start();
    }

    @Override
    public void run() {
        while (true) {
            queue.get();
        }
    }
}
