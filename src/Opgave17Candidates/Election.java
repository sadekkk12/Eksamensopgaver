package Opgave17Candidates;

import java.util.ArrayList;

public class Election {
    private Candidate[] kandidater;


    public Election(){
        Candidate kandidat1 = new Candidate("test1", "Party1", 10);
        Candidate kandidat2 = new Candidate("test2", "Party2", 11);
        Candidate kandidat3 = new Candidate("test3", "Party1", 1);
        Candidate kandidat4 = new Candidate("test4", "Party3", 5);
        Candidate kandidat5 = new Candidate("test5", "Party4", 20);
        Candidate kandidat6 = new Candidate("test6", "Party3", 0);
        kandidater = new Candidate[]{kandidat1, kandidat2, kandidat3, kandidat4, kandidat5, kandidat6};
    }

    public int getTotalVotes(){
        int totalVotes = 0;
        for(Candidate kandidat : kandidater){
            totalVotes += kandidat.getNumberOfVotes();
        }
        return totalVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> returnList = new ArrayList<>();
        for (Candidate candidate : kandidater) {
            if (candidate.getParty() == party){
                returnList.add(candidate);
            }
        }
        return returnList;
    }
    public static void main(String[] args){
        Election election = new Election();
        System.out.println(election.getTotalVotes());
        System.out.println(election.getCandidatesFromParty("Party1"));
        System.out.println(election.getCandidatesFromParty("Party2"));
    }
}