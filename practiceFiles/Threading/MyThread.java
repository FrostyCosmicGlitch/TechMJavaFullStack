/*

// we are creating this thread using extending

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("The thread we created is running...");
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
    }
}



// we are creating this thread using implements

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("The thread we created is using runnable");
    }
    public static void main(String[]args){
        MyThread obj=new MyThread();
        Thread t1=new Thread(obj);
        t1.start();
    }
}



//difference between running run() seperately as method and running it as thread(start())


class MyThread extends Thread{
    //public void run() {
        //System.out.println("Child thread is running "+ Thread.currentThread().getName());

    //}

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread is running " + Thread.currentThread().getName());
    }

    public static void main(String [] args){
        System.out.println("Main thread is running "+ Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            MyThread t = new MyThread();
            t.start();
        }

    }
}


 */
 class MyThread implements Runnable{
    public void run(){
        System.out.println("This a a thread from runnable child "+Thread.currentThread().getName());
    }
    public static void main(String[]args){
        System.out.println("This is runnable main thread "+Thread.currentThread().getName());
        MyThread runn=new MyThread();
        Thread t1=new Thread(runn);
        Thread t2=new Thread(runn);
        t1.start();
        t2.start();
    }
}
