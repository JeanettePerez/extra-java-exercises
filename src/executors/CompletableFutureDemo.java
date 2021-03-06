package executors;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureDemo {
    // =========== Transforming a Completable Future ========
//    public static int toFahrenheit(int celsius){
//        return (int) (celsius * 1.8) + 32;
//    }
//
//    public static void completableFutureDemoShow() {
//        var future = CompletableFuture.supplyAsync(() -> 20); //
//            future
//                .thenApply(CompletableFutureDemo::toFahrenheit) // transform
//                .thenAccept(System.out::println); // consume result
//    }
// =========== Composing Completable Futures ==========
//    public static CompletableFuture<String> getUserEmailAsync() {
//        return CompletableFuture.supplyAsync(() -> "email"); // real wold you'll be querying a database
//    }
//     public static CompletableFuture<String> getPlaylistAsync(String email) {
//        return CompletableFuture.supplyAsync(() -> "playlist");
//     }
//    public static void completableFutureDemoShow() {
//        // wanting to get users email from the id
//        getUserEmailAsync()
//            .thenCompose(CompletableFutureDemo::getPlaylistAsync)
//            .thenAccept(playlist -> System.out.println(playlist));// real world returns list of songs
//        // email -> playlist
// ========== Combining Completable Futures ===========
    public static void completableFutureDemoShow(){
//        // ability to start two task async and combine the results
//        // TODO: Call a remote service to get the price of a product in USD.
//        //  Call another service to get the exchange rate of dollars in EUROS.
//        var first = CompletableFuture.supplyAsync(() -> 20);
//        var second = CompletableFuture.supplyAsync(() -> 0.9);
//        first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate).thenAccept(System.out::println);
//        // TODO: repeat the first todo except this time the price is a string that reads 20USD. Convert to get your results
//        var USD = CompletableFuture
//                .supplyAsync(() -> "20USD")
//                .thenApply(str -> {
//                    var price = str.replace("USD", "");
//                    return Integer.parseInt(price);
//                });
//        var rate = CompletableFuture.supplyAsync(() -> 0.9);
//        USD.thenCombine(rate,(price, exchangeRate) -> price * exchangeRate).thenAccept(System.out::println);
// === Price Finder ===
        var start = LocalTime.now();
        var service = new FlightService();
        var futures = service.getQuotes()
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());
        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    var end = LocalTime.now();
                    var duration = Duration.between(start,end);
                    System.out.println("Retrieved all quotes in " + duration.toMillis() + " msecs");
                });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        completableFutureDemoShow();
    }
    }

