package priceFinder;



public class MainPriceFinder {
    public static void main(String[] args) {
        var service = new HotelService();
        service.getQuote("site1").thenAccept(System.out::println);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
