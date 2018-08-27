package rental_homework;

public class NewReleasePrice extends Price{
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    double getCharge(int dayRented) {
        double result = 0;
        result += dayRented*3;
        return result;
    }
}
