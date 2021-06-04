public class Main {
    public static void main(String[] args) throws InterruptedException {
//        1. Реализовать программу, в которой два потока поочередно пишут ping и pong.
//        2. Реализовать потокобезопасный счетчик с помощью интерфейса Lock.

        tennis(); //task1

        counter(); //task2
    }

    private static void tennis() {
        String beginner = "ping";
        Tennis tennis = new Tennis(beginner, 10);

        Thread player1 = new Thread(new Runnable() {
            @Override
            public void run() {
                tennis.ping();
            }
        });

        Thread player2 = new Thread(new Runnable() {
            @Override
            public void run() {
                tennis.pong();
            }
        });

        player1.start();
        player2.start();
    }

    private static void counter() throws InterruptedException {

        CounterLock counter = new CounterLock();

        CounterLockThread clt1 = new CounterLockThread(counter);
        CounterLockThread clt2 = new CounterLockThread(counter);
        CounterLockThread clt3 = new CounterLockThread(counter);
        CounterLockThread clt4 = new CounterLockThread(counter);
        CounterLockThread clt5 = new CounterLockThread(counter);

        clt1.run();
        clt2.run();
        clt3.run();
        clt4.run();
        clt5.run();

        Thread.sleep(5000);
        System.out.println("Итоговое значение счётчика: " + counter.getCount());

    }

}
