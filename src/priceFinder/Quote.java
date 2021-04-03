package priceFinder;

public class Quote {

    private final String SITE;
    private final float PRICE;

    public Quote(String SITE, float PRICE) {
        this.SITE = SITE;
        this.PRICE = PRICE;
    }

    public String getSITE() {
        return SITE;
    }

    public float getPRICE() {
        return PRICE;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "SITE='" + SITE + '\'' +
                ", PRICE=" + PRICE +
                '}';
    }
}
