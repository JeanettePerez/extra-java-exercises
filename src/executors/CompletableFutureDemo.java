package executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    // =========== Transforming a Completable Future ========
    public static int toFahrenheit(int celsius){
        return (int) (celsius * 1.8) + 32;
    }

    public static void completableFutureDemoShow() {
        var future = CompletableFuture.supplyAsync(() -> 20); //
            future
                .thenApply(CompletableFutureDemo::toFahrenheit) // transform
                .thenAccept(System.out::println); // consume result
    }

    public static void main(String[] args) {
        completableFutureDemoShow();
    }
    }

