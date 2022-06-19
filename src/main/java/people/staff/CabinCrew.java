package people.staff;

public class CabinCrew extends Staff{

    public CabinCrew(String name, RankType rank) {
        super(name, rank);
    }

    public String relayMessage(String cabinCrewMessage) {
        return cabinCrewMessage;
    }
}
