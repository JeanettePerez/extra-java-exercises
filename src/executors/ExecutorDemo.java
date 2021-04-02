package executors;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class ExecutorDemo {
    public static void executorShow() {
// ========== executors ==========
//        var executor = Executors.newFixedThreadPool(2);
//        try {
//            executor.submit(() -> {
//                System.out.println(Thread.currentThread().getName());
//            });
//        } finally {
//            // have to explicitly shut down
//            executor.shutdown();
//
//        }
// ========== Callables and futures ==========
        // callable interface: contains a single method call() that returns a generic value
        // Future interface: represents future result of an operation
//        var executor = Executors.newFixedThreadPool(2);
//        try {
//            var future = executor.submit(() -> {
//               LongTask.simulate(); // simulating an operation that is going to take 3 seconds
//               return 1;
//            });
//            System.out.println("do more");
//            try {
//                var result = future.get(); // how you get the result of the operation
//                // get method is a block method everything has to wait till the result of the task is ready
//                System.out.println(result);
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        } finally {
//            // have to explicitly shut down
//            executor.shutdown();
//
//        }
// ========= Asynchronous Programming ===========
// the problem with the code above comes when dealing with bigger applications
        // usually the main thread is responsible for UI controls and can run into
        // problems because if you make he main thread wait for another thread it is not going to be able
        // to respond to UI events. application will freeze.
        // Asynchronous Programming: writing code that is none blocking
        // using the completable futures
// ========== completable futures ==========
        //  explicitly complete a future object
        // creating a completable future object
//        Supplier<Integer> task = () -> 1;
//        var future = CompletableFuture.supplyAsync(task); // to return a value
//        try {
//            var result = future.get();
//        System.out.println(result);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
// ========== Running code on Completion ==========
//        var future = CompletableFuture.supplyAsync(() -> 1);
////        future.thenRun(() -> System.out.println("done")); // run some code when this task is finished. executed in main
//        future.thenRunAsync(() -> { // executed in ForkJoinPool.commonPool-worker-3
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("done");
//        });
// ========== handling exceptions ==========
//        var future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Getting the current weather");
//            throw new IllegalStateException();
//        });
//
//        try {
//            var temperature =future.exceptionally(ex -> 1).get(); // exceptionally is a new future
//            System.out.println(temperature);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
    }


    public static void main(String[] args) {
        // ========== Implementing an Asynchronous API ===========
        // this will allow for hello world to run even if mail hasn't been sent then display a message that mail was sent then it'll terminate operation
//        var service = new MailService();
//        service.sendAsync();
//        System.out.println("Hello World");
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }


}

