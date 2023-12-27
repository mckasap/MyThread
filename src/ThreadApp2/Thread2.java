package ThreadApp2;

public class Thread2 implements  Runnable{
    volatile int i=0;
    @Override
    public synchronized void run() {

        for(;i<100;i++)
            System.out.println(Thread.currentThread().getName()+"i: "+i);
    }
}
