package rental_homework;


public class ChildrensPrice extends Price {

    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    double getCharge(int dayRented) {
        double result = 2;
        if(dayRented > 2){
            result += (dayRented - 2) * 1.5;
        }
        return result;
    }

}
