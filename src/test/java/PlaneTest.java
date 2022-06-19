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
        System.out.println(plane.getPlaneType());
        assertEquals(PlaneType.WIDE_BODY_AIRLINER, plane.getPlaneTypeEnumKey());
    }

    @Test
    public void planeTypeHasAValue(){
        assertEquals("Airbus A350", plane.getPlaneTypeValueFromEnum());
    }

}
