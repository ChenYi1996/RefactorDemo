package rental_homework;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public double getCharge() {
        return this.movie.getPrice().getCharge(this.dayRented);
    }

    int getFrequentRentalPoints() {
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDayRented() > 1) {
            return 2;
        } else {
            return 1;
        }
    }


}
