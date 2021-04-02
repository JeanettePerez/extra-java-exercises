package executors;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

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
        // callable interface:
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
        

    }



    public static void main(String[] args) {
        executorShow();
    }

}

