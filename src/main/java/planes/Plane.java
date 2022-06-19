package planes;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    // returns enum key
    public PlaneType getPlaneTypeEnumKey() {
        return planeType;
    }

    // returns value of enum key
    public String getPlaneTypeNameValueFromEnum(){
        return planeType.getPlaneTypeName();
    }

    public int getPassengerCapacityValueFromEnum() {
        return planeType.getCapacity();
    }

    public double getMaxLoadValueFromEnum() {
        return planeType.getMaximumLoadInKg();
    }
}
