package rental_homework;

public class RegularPrice extends Price{
    int getPriceCode() {
        return Movie.REGULAR;
    }

    double getCharge(int dayRented) {
        double result = 0;
        result += 2;
        if(dayRented>2)
            result += (dayRented-2)*1.5;
        return result;
    }
}
