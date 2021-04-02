package executors;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send() {
        LongTask.simulate();
        System.out.println("mail sent"); // long operations shouldnt run on the main thread
    }

    public CompletableFuture<Void> sendAsync() { // method to convert to send to be async
        return CompletableFuture.runAsync(this::send); // runAsync() when you don't want to return a value
    }
}
