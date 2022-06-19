import org.junit.Before;
import org.junit.Test;
import people.staff.CabinCrew;
import people.staff.RankType;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    private CabinCrew cabinCrew;
    @Before
    public void before(){
        cabinCrew = new CabinCrew("Jerry", RankType.RANK4);
    }

    @Test
    public void crewCanRelayMessages(){
        String cabinCrewMessage = "This is a reminder to all passengers that peanuts are strictly forbidden on this flight.";
        assertEquals("This is a reminder to all passengers that peanuts are strictly forbidden on this flight.", cabinCrew.relayMessage(cabinCrewMessage));
    }
}
