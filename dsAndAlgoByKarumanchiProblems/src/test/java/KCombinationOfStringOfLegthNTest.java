import Recursion.KCombinationOfStringOfLegthN;
import org.testng.annotations.Test;

/**
 * Created by swathi on 9/1/2015.
 */
public class KCombinationOfStringOfLegthNTest {
    KCombinationOfStringOfLegthN k = new KCombinationOfStringOfLegthN();

    @Test
    public void shouldGenerateCombination(){
        k.generateCombination("abc" , 3);

    }

}