package Practice.Multithread;

// WE HAV ETO EXTEND THE THREAD FIRST
public class MultithreadThing extends Thread {
    private int threadNumber;

    public MultithreadThing (int threadNumber){
        this.threadNumber = threadNumber;
    }
    int i;

    // WE HAVE TO OVERRIDE THE THREAD CLASSES RUN METHOD
    @Override
    // WE INSERT OUR CODE
    public void run() {
        for (i = 1; i <= 5 ; i++);
        System.out.println(i + "from thread " + threadNumber);
        // TO MAKE IT SLEEP 1s BETWEEN EACH NUMBER PRINTOUT THAT WAY WE CAN WATCH IT PRINT EACH NBR AT A TIME
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

    }
}
