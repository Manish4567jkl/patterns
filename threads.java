class MyThread extends Thread{
    public void run(){
        for(int i=1;i<3;i++){
            System.out.println("from thread 1"+i);
        }
        System.out.println("exit fromm  A");
    }
}

class MyThread1 extends Thread{
    {
        for(int i=1;i<3;i++){
            System.out.println("from thread 2"+i);
        }
        System.out.println("exit fromm  b");
    }
}
public class thr {
    public static void main(String[] args) {
        MyThread a = new MyThread();
        a.start();

        new MyThread1().start();
    }
}

