package music;
import  java.util.ArrayList;

/**
 * JavaBean class to supply a list of music genres and the
 * number of user votes for each
 * @author drdan
 */
public class GenreVotes {
      ArrayList<SingleGenre> genreList;
    
    /**
     * Create new object  pre-loaded  with a list of common genres
     */
    public  GenreVotes(){
        genreList = new ArrayList<SingleGenre>();
        genreList.add(new SingleGenre("Classical"));
        genreList.add(new SingleGenre("Rock"));
        genreList.add(new SingleGenre("Salsa"));
        genreList.add(new SingleGenre("Celtic"));
        genreList.add(new SingleGenre("Old Time"));
        genreList.add(new SingleGenre("Electronic Dance Music"));
        genreList.add(new SingleGenre("Bluegrass"));
    }
    
    /**
     * Return the entire list of music genres
     * @return the list of all genres and their votes
     */
    public ArrayList<SingleGenre> getGenreList(){
        return genreList;
    }
    
    /**
     * Add a vote to a particular genre
     * @param genreVote of the genre for which user has voted
     */
    public void setMusicVote(String genreVote){
        //todo: implement this method
}
}