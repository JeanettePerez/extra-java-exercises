package priceFinder;

import executors.LongTask;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class HotelService {

    public CompletableFuture<Quote> getQuote(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting quote from " + site);

            LongTask.simulate();
            var random = new Random();
            var price = 100 + random.nextInt(10);

            return new Quote(site, price);
        });
    }
}
