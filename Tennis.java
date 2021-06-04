public class Tennis {
    private String flag;
    private int kicks;
    private int kick = 0;

    public Tennis(String flag, int kicks) {
        this.flag = flag;
        this.kicks = kicks;
    }

    public synchronized void ping() {
            try {
                while (kick < kicks) {
                    while (!flag.equals("ping")) {
                        wait();
                    }
                    System.out.println("ping");
                    flag = "pong";
                    kick++;
                    notifyAll();
                }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

    }

    public synchronized void pong() {
        try {
            while (kick < kicks) {
                while (!flag.equals("pong")) {
                    wait();
                }
                System.out.println("pong");
                flag = "ping";
                kick++;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
