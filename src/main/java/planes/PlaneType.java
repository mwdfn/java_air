package planes;

public enum PlaneType {

    MIDSIZE_JET("Bombardier Learjet 35"),
    NARROW_BODY_AIRLINER("Boeing 757"),
    WIDE_BODY_AIRLINER("Airbus A350");

    private final String name;

    PlaneType(String name) {
        this.name = name;
    }

    public String getPlaneTypeValue(){
        return this.name;
    }
}
