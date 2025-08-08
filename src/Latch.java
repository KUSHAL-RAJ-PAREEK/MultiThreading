import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Latch {

    public static void main(String[] args) throws InterruptedException {
        int numberOfServices = 3;

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);

        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await(2, TimeUnit.SECONDS);

        System.out.println("Main");
        executorService.shutdown();
    }

}

class DependentService implements Runnable{

    private final CountDownLatch latch;

    public DependentService(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() +
                    " service started.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally{
            latch.countDown();
        }
    }
}

