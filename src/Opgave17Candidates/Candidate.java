package Opgave17Candidates;

public class Candidate {
    private String name, party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes){
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public int getNumberOfVotes(){
        return numberOfVotes;
    }
    public String getParty(){
        return party;
    }

    @Override
    public String toString() {
        return "Name:" + " " + name + ", " + "party:" + " " + party;
    }
}
