import org.junit.Before;
import org.junit.Test;
import people.passengers.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    @Before
    public void before(){
        passenger = new Passenger("Jane", 2);
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
