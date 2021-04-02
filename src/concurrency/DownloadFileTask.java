package concurrency;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
//        System.out.println("Downloading a file: " + Thread.currentThread().getName()); // placeholder for the time being
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Download complete " + Thread.currentThread().getName());
        // === interrupting thread
//        System.out.println("Downloading a file: " + Thread.currentThread().getName());
//
//            for(var i = 0; i < Integer.MAX_VALUE; i++) {
//                if(Thread.currentThread().isInterrupted()) return; // if this statement returns true break or return
//                System.out.println("Downloading byte " + i); // else download the byte
//
//            }
//
//        System.out.println("Download complete " + Thread.currentThread().getName());
// ========== Race Conditions =========
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for(var i = 0; i < 10_000; i++) {
            if(Thread.currentThread().isInterrupted()) return; // if this statement returns true break or return
            status.incrementTotalBytes();
        }

        System.out.println("Download complete " + Thread.currentThread().getName());
    }


}
