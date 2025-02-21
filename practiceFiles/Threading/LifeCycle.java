


class TThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running "+getState());
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The thread is about to get terminated :"+getState());
    }
}

public class LifeCycle {
    public static void main(String [] args){
        TThread t1=new TThread();
        System.out.println("Thread state before start(): "+t1.getState());
        t1.start();
        System.out.println("Thread state after start(): "+t1.getState());
        try{
            Thread.sleep(500);
            System.out.println("Thread state while sleeping: "+t1.getState());
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state after completion: "+t1.getState());


    }
}
