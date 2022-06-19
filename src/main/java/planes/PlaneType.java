package planes;

public enum PlaneType {

    MIDSIZE_JET("Bombardier Learjet 35", 60, 8164.66),
    NARROW_BODY_AIRLINER("Boeing 757", 243, 39800.00),
    WIDE_BODY_AIRLINER("Airbus A350", 410, 280000.00);

    private final String name;
    private final int capacity;
    private final double maximumLoadInKg;

    PlaneType(String name, int capacity, double maximumLoadInKg){
        this.name = name;
        this.capacity = capacity;
        this.maximumLoadInKg = maximumLoadInKg;
    }

    public String getPlaneTypeName(){
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getMaximumLoadInKg() {
        return maximumLoadInKg;
    }

//    PlaneType[] planeType = PlaneType.values();



}
