package valerie;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println("Drawn Card " + currentThread().getName());


    }
}


