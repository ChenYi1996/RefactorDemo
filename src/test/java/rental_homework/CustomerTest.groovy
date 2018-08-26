package rental_homework

import spock.lang.Specification
import spock.lang.Unroll

class CustomerTest extends Specification{

    @Unroll
    def 'should return cost: #COST when input rental_details: #RENTAL_INFO'() {

        given:
        Customer c = new Customer("")
        RENTAL_INFO.every {
            item ->
                Movie movie = new Movie(item['name'],item['price_code'])
                c.addRental(new Rental(movie,item['day']))

        }
        expect:
        c.getTotalCharge() == COST
        where:
        RENTAL_INFO                                                                             |     COST
        [['name':'movie_1','price_code':1,'day':2]]                                             |     6.0
        [['name':'movie_0','price_code':0,'day':1]]                                             |     2
        [['name':'movie_0','price_code':0,'day':3]]                                             |     3.5
        [['name':'movie_2','price_code':2,'day':1]]                                             |     1.5
        [['name':'movie_2','price_code':2,'day':3]]                                             |     1.5
        [['name':'movie_2','price_code':2,'day':4]]                                             |     3.0


    }


}
