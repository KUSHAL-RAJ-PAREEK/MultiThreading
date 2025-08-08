import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> f1 =
                CompletableFuture.supplyAsync(() ->{
                    try {
                        Thread.sleep(5000);
                        System.out.println("Worker 1");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "ok";
                });

        CompletableFuture<String> f2 =
                CompletableFuture.supplyAsync(() ->{
                    try {
                        Thread.sleep(5000);
                        System.out.println("Worker 2");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "ok";
                }).thenApply(x -> x + x);

        System.out.println(f2.get());

//        CompletableFuture<Void> f = CompletableFuture.allOf(f1,f2);
//
////        f.join();
//        f.get();
//
//        System.out.println("Main");
    }

}
