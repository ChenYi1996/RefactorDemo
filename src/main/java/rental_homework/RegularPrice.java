package rental_homework;

public class RegularPrice extends Price{
    int getPriceCode() {
        return Movie.REGULAR;
    }

    double getCharge(int dayRented) {
        double result = 0;
        result += dayRented * 3;
        return 0;
    }
}
