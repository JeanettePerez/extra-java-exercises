package concurrency;

public class ThreadDemo {
    public static void main(String[] args) {
// ========== Processes and Threads =========
        System.out.println(Thread.activeCount()); // return the number of active threads in the current process
        System.out.println(Runtime.getRuntime().availableProcessors()); // how many threads that are available
// ========= Starting a Thread ==========
        // use thread class and create a new thread

        Thread thread = new Thread();
        // wanting to download files concurrently
    }
}
