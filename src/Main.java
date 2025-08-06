public class Main extends Thread{

    public static void main(String[] args) throws InterruptedException {
      FairnessLockExample example = new FairnessLockExample();
      Runnable task = new Runnable() {
          @Override
          public void run() {
          example.accessResource();
          }
      };

      Thread t1 = new Thread(task,"Thread 1");
      Thread t2 = new Thread(task,"Thread 2");
        Thread t3 = new Thread(task,"Thread 3");
        Thread t4 = new Thread(task,"Thread 4");

      t1.start();
      t2.start();
      t3.start();
      t4.start();
    }
}