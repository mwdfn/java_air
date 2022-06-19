import org.junit.Before;
import org.junit.Test;
import planes.Plane;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    @Before
    public void before(){
        plane = new Plane(PlaneType.WIDE_BODY_AIRLINER);
    }

    @Test
    public void hasAPlaneType(){
        assertEquals(PlaneType.WIDE_BODY_AIRLINER, plane.getPlaneTypeEnumKey());
    }

    @Test
    public void planeTypeHasAValue(){
        assertEquals("Airbus A350", plane.getPlaneTypeNameValueFromEnum());
    }

    @Test
    public void planeTypeHasPassengerCapacity() {
        assertEquals(243, plane.getPassengerCapacityValueFromEnum());
    }

    @Test
    public void planeHasMaxLoad() {
        assertEquals(39800.00,39800.00, plane.getMaxLoadValueFromEnum());
    }
}
