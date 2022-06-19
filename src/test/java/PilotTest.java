import org.junit.Before;
import org.junit.Test;
import people.staff.Pilot;
import people.staff.RankType;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Amber", RankType.RANK1,"PL0000");
    }

    @Test
    public void hasLicenceNumber(){
        assertEquals("PL0000", pilot.getLicenceNumber());
    }
}
