import org.junit.Before;
import org.junit.Test;
import people.staff.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Amber", "Captain","PL0000");
    }

    @Test
    public void hasLicenceNumber(){
        assertEquals("PL0000", pilot.getLicenceNumber());
    }
}
