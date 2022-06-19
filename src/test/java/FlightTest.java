import flights.Flight;
import org.junit.Before;
import org.junit.Test;
import people.passengers.Passenger;
import planes.Plane;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger1;

    @Before
    public void before(){
        flight = new Flight(PlaneType.MIDSIZE_JET,"FL001", "Gatwick", "Edinburgh", "13:00");
        passenger1 = new Passenger("Cher", 3);
        flight.addPassengerToPlane(passenger1);
    }

    @Test
    public void canReturnNumberOfSeats(){
        assertEquals(60, flight.getNumberOfSeats());
    }

    @Test
    public void canAddPassengerToPlane(){
        assertEquals(1, flight.getNumberOfPassengers());
    }

//    @Test
//    public void canReturnNumberOfAvailableSeats(){
//        assertEquals(60, flight.getAvailableSeats());
//    }
}
