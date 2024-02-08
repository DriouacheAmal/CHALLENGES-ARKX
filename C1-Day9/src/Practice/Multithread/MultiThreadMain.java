package Practice.Multithread;

public class MultiThreadMain {
    public static void main(String[] args) {

        for (int i = 0; i<=3; i++){
            MultithreadThing myThing = new MultithreadThing(i);
            myThing.start();
        }
        // MultithreadThing myThing = new MultithreadThing();
        //MultithreadThing myThing2 = new MultithreadThing();

       // myThing.run();
        //myThing2.run();

    }

}
