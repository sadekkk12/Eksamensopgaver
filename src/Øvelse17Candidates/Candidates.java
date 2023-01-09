package Øvelse17Candidates;

public class Candidates {
    String name;
    String party;
    int numberOfVotes;
public Candidates(String name, String party, int numberOfVotes){
    this.name = name;
    this.party = party;
    this.numberOfVotes = numberOfVotes;
}

    public static void main(String[] args) {
        Candidates candidate1 = new Candidates("sadek", " hold D", 10);
        System.out.println(candidate1);
    }
    public String toString(){
    return "Candidate:" + name + ", " + "party:" + party + ", " + "number of votes " + numberOfVotes;
    }
}
