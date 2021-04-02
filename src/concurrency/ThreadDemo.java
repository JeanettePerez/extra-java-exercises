package concurrency;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void threadShow() {
// ========== Processes and Threads =========
//        System.out.println(Thread.activeCount()); // return the number of active threads in the current process
//        System.out.println(Runtime.getRuntime().availableProcessors()); // how many threads that are available
//// ========= Starting a Thread ==========
//        // use thread class and create a new thread
//        for(var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask());
//            // wanting to download files concurrently
//            //  step 1: make a class that implements the Runnable interface
//            //  step 2: pass a new instance of the class in step one into the new instance of the thread
//            //  step 3: attach start() to the variable of the new Thread to start the thread
//            thread.start();
//        }
//        System.out.println(Thread.currentThread().getName()); // the main of the current thread that is running
// === interrupting thread
//    Thread thread = new Thread(new DownloadFileTask());
//    thread.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        thread.interrupt();
// ========= Race Conditions
// making a new instance of the DownloadStatus class
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for(var i = 0; i < 10; i++)  {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }
        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(status.getTotalBytes());
        }
    }





    public static void main(String[] args) {
        threadShow();
    }


}
