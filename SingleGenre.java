/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

/**
 * Represents a single music genre with the genre name and number of 
 * votes so far
 * @author drdan
 */
public class SingleGenre {
     int votes;
     String genreName;
    
    /**
     * Create a new genre with no votes so far.
     * @param name Name of this genre
     */
    public SingleGenre(String name){
        genreName = name;
        votes=0;
    }
    
    /**
     * Add  votes for this genre to the existing number of votes
     * @param nVotes number of new votes to add     */
    public void setVote(int nVotes){
        votes += nVotes;
    }

    /* 
     *Return the genre name 
    */
    public String getGenreName(){
        return genreName;
    }
    /* 
     *Return the number of votes
    */
    public int getVotes(){
        return votes;
    }
}
