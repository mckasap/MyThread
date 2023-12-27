public class Main {
    public static void main(String[] args) {
        MyThreadWithExtension mth= new MyThreadWithExtension();
        MyThreadFromImplents mtI=new MyThreadFromImplents();
        Thread t= new Thread(mtI);
        mth.start();
        t.start();
       for(int i=1;i<100;i++)
        System.out.println(Thread.currentThread().getName() +" Hello world!");



    }
}