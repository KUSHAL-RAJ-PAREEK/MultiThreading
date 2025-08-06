import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {

    private final Lock lock = new ReentrantLock(true);


    public void accessResource(){
        lock.lock();

        try{
            System.out.println(
                    Thread.currentThread().getName()
                    +" acquired the lock."
            );
            Thread.sleep(3000);
        }catch (Exception  e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()
            +" realeased the lock.");
            lock.unlock();
        }
    }
}
