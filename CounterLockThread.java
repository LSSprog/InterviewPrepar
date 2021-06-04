import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLockThread implements Runnable {
    private CounterLock counter;
    private Lock lock;

    public CounterLockThread(CounterLock counter) {
        this.counter = counter;
        this.lock = new ReentrantLock();
    }

    @Override
    public void run() {
        try {
            lock.lock();
            counter.incCount();
        } finally {
            lock.unlock();
        }
    }
}
