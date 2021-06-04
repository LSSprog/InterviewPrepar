package test.counter;

public class MainCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 20; i++) {
            CounterThread ct = new CounterThread(counter);
            ct.start();
        }
        Thread.sleep(5000);
        System.out.println("Итоговое значение счётчика: " + counter.getCounter());
    }
}
