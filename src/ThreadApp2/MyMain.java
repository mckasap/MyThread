package ThreadApp2;

public class MyMain {

    public static void main(String[] args){

        Thread2 t2= new Thread2();
        Thread t= new Thread(t2);
        Thread t3= new Thread(t2);

        t.start();
        t3.start();;
    }
}
