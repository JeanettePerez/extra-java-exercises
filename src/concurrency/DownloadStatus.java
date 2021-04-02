package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private boolean isDone;
    private AtomicInteger totalBytes = new AtomicInteger();// storing number of byte we downloaded
    // atomic types are faster and easier to use
    private int totalFiles;

    public int getTotalBytes() {
        return totalBytes.get();
    }
    public void incrementTotalBytes() {
        totalBytes.incrementAndGet(); // ++a
    }

    public int incrementTotalFiles(){
        return totalFiles;
    }
    public boolean isDone() {
        return isDone;
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}
