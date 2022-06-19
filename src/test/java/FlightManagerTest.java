import flights.Flight;
import org.junit.Before;
import org.junit.Test;
import people.passengers.Passenger;
import people.staff.FlightManager;
import people.staff.RankType;
import planes.Plane;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before(){
        flightManager = new FlightManager("Cerys", RankType.RANK5);
        flight = new Flight(PlaneType.MIDSIZE_JET, "FL001", "Gatwick", "Edinburgh", "13:00");
        passenger1 = new Passenger("Cher", 3);
        passenger2 = new Passenger("Dido", 4);
        passenger3 = new Passenger("Moby", 5);
        flight.addPassengerToPlane(passenger1);
        flight.addPassengerToPlane(passenger2);
        flight.addPassengerToPlane(passenger3);
    }

//    @Test
//    public void canCalculatePassengerBaggageAllowance(){
//        assertEquals();
//    }
}
