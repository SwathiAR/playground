import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 9/21/2015.
 */
public class ReverseLongerTest {

@Test
 public void shorterReverseLongerTest(){
            assertEquals("abcdetsrifabcde", ReverseLonger.shorterReverseLonger("first", "abcde"));
            assertEquals("bauollehbau",ReverseLonger.shorterReverseLonger("hello", "bau"));
            assertEquals("fghiedcbafghi",ReverseLonger.shorterReverseLonger("abcde", "fghi"));

        }




    }

