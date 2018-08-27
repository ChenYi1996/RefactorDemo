package rental_homework;


public class ChildrensPrice extends Price {

    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    double getCharge(int dayRented) {
        double result = 1.5;
        if(dayRented>3)
            result += (dayRented-3)*1.5;
        return result;
    }

}
