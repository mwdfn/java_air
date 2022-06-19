package people.staff;

import people.Person;

public class Staff extends Person {

    private RankType rank;

    public Staff(String name, RankType rank) {
        super(name);
        this.rank = rank;
    }

    // return enum key
    public RankType getRankEnumKey(){
        return rank;
    }

    // return enum key value
    public String getRankEnumValue(){
        return rank.getRankTypeValue();

    }

}
