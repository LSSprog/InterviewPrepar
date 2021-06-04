public class CounterLock {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void incCount() {
        count++;
        System.out.println("Присвоен новый номер счётчика: " + count);
    }
}
