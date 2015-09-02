import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 8/20/2015.
 */
public class FactorialTest {

    Factorial f = new Factorial();

    @Test
    public void shouldCalculateFactorial(){
        Assert.assertEquals(f.findFact(3) , 6);
        Assert.assertEquals(f.findFact(1) , 1);
        Assert.assertEquals(f.findFact(0) , 1);
        Assert.assertEquals(f.findFact(4) , 24);
    }

}