import Recursion.BinaryStringsGeneration;
import org.testng.annotations.Test;

/**
 * Created by swathi on 8/21/2015.
 */
public class BinaryStringsGenerationTest {
    BinaryStringsGeneration bs = new BinaryStringsGeneration();

    @Test
    public  void shouldgenerateStrings(){
        bs.generate(4);
    }

}