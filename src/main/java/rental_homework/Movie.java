package rental_homework;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
        set_priceCode();
    }

    public void set_priceCode() {
        switch(priceCode){
            case Movie.CHILDRENS:
                price = new ChildrensPrice();
                break;
            case Movie.NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case Movie.REGULAR:
                price = new RegularPrice();
                break;
        }
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }
}
