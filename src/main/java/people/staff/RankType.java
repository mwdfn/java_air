package people.staff;

public enum RankType {

    RANK1("Captain"),
    RANK2("First Officer"),
    RANK3("Purser"),
    RANK4("Flight Attendant");

    private final String rankName;

    RankType(String rankName) {
        this.rankName = rankName;
    }

    public String getRankTypeValue(){
        return this.rankName;
    }
    
}
