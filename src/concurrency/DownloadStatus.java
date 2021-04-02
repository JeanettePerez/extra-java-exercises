package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private boolean isDone;
//    private AtomicInteger totalBytes = new AtomicInteger(); // atomic types are faster and easier to use
    private int totalBytes;// storing number of byte we downloaded
    private int totalFiles;

    public int getTotalBytes() {
//        return totalBytes.get(); // for atomic type
        return totalBytes;
    }
    public void incrementTotalBytes() {
//        totalBytes.incrementAndGet(); // ++a, for atomic types
        totalBytes++;
    }

    public void incrementTotalFiles(){
        totalFiles++;
    }
    public boolean isDone() {
        return isDone;
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}
