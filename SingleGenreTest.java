
package music;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  Test for the basic single genre class
 * @author drdan
 */
public class SingleGenreTest {
    
    public SingleGenreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Test of setVote method, of class SingleGenre.
     */
    @Test
    public void testSetVote() {
        System.out.println("setVote");
        SingleGenre instance = new SingleGenre("Symphonic Metal");
        instance.setVotes(1);
        assertEquals(1,instance.getVotes());
        instance.setVotes(4);
        assertEquals(5,instance.getVotes());
    }

    /**
     * Test of getGenreName method, of class SingleGenre.
     */
    @Test
    public void testGetGenreName() {
        System.out.println("getGenreName");
        SingleGenre instance = new SingleGenre("Electronic Dance Music");
        String expResult = "Electronic Dance Music";
        String result = instance.getGenreName();
        assertEquals(expResult, result); 
    }

    
    
}
