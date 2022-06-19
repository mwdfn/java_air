package people.staff;

public class Pilot extends Staff{

    private String licenceNumber;

    public Pilot(String name, RankType rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String flyPlane(){
        return "This is your captain speaking. My name's " + name + ". Fasten your seatbelts and prepare for liftoff.";
    }
}
