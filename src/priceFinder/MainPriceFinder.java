package priceFinder;


import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class MainPriceFinder {
    public static void main(String[] args) {
        var start = LocalTime.now();
        var service = new HotelService();
        var futures = service
                .getQuotes()
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());
        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    var end = LocalTime.now();
                    var duration = Duration.between(start,end);
                    System.out.println("Retrieved all quotes in " + duration.toMillis() + "msecs");
                });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
