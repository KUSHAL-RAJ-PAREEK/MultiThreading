package executerframework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
//long startTime = System.currentTimeMillis();
//
//        ExecutorService executer = Executors.newFixedThreadPool(3);
//
//        for(int i = 0; i < 10; i++){
//            int finalI = i;
//            executer.submit(()->{
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(finalI);
//            });
//
//        }
//
//        executer.shutdown();
//        try {
//            while(!executer.awaitTermination(1, TimeUnit.SECONDS));
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Execution Time: " + (System.currentTimeMillis() - startTime));


//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<?> future = executorService.submit(() -> System.out.println("HELLO"),"Success");
//        System.out.println(future.get());
//        if(future.isDone()){
//            System.out.println("Done!");
//        }
//        executorService.shutdown();

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        Future<Integer> submit = executorService.submit(() -> 1 + 2);
//
//        Integer i = submit.get();
//        System.out.println("sum is: " + i);
//        executorService.shutdown();
//        Thread.sleep(1000);
//        System.out.println(executorService.isTerminated());


//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        Callable<Integer> callable1 = () ->{
//            System.out.println("Task 1");
//            Thread.sleep(1000);
//            return 1;
//        };
//
//        Callable<Integer> callable2 = () ->{
//            System.out.println("Task 2");
//            Thread.sleep(1000);
//            return 2;
//        };
//
//        Callable<Integer> callable3 = () ->{
//            System.out.println("Task 3");
//            Thread.sleep(1000);
//            return 3;
//        };


//        List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
//
//        List<Future<Integer>> futures = null;
//        try {
//            futures = executorService.invokeAll(list,1, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        for(Future<Integer> f : futures){
//            try {
//                System.out.println(f.get());
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (CancellationException e) {
//
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//        }

//        try {
//           Integer i =  executorService.invokeAny(list);
//            System.out.println(i);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//
//        executorService.shutdown();
//        System.out.println("Hello world");



//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<Integer> future = executorService.submit(() ->{
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                System.out.println("Execption occured: "+e);
//            }
//            System.out.println("Hello");
//            return 42;
//        });

//        Integer i = null;
//
//
//        try {
//            i = future.get(1,TimeUnit.SECONDS);
//            System.out.println(future.isDone());
//            System.out.println(i);
//        } catch (InterruptedException | TimeoutException | ExecutionException e) {
//            System.out.println("Execption occurred: "+e);
//        }

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        future.cancel(false);
//        System.out.println(future.isCancelled());
//        System.out.println(future.isDone());
//        executorService.shutdown();



    }
}
