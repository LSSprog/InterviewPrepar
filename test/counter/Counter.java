package test.counter;

public class Counter {
    private long counter = 0L;

    public long getCounter() {
        return counter;
    }

    public synchronized void incCounter() {
        counter++;
        System.out.println("Счёт: " + counter);
    }
}
