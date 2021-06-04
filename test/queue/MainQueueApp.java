package test.queue;

public class MainQueueApp {
    public static void main(String[] args) {
        SyncQueue queue = new SyncQueue();
        new Sender(queue);
        new Receiver(queue);
    }
}
