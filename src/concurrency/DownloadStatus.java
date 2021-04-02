package concurrency;

public class DownloadStatus {
    private int totalBytes;// storing number of byte we downloaded

    public int getTotalBytes() {
        return totalBytes;
    }
    public void incrementTotalBytes() {
        totalBytes++;
    }
}
