import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 6/16/2015.
 */
public class BloomFilterImplTest {

    @Test
    public void initialCheck(){
        BloomFilterImpl b = new BloomFilterImpl("C:\\Users\\swathi\\IdeaProjects\\csvFile\\kata3\\wordlist.txt");
        String s = b.checkExists("Swathi");
        System.out.println(s);
        Assert.assertEquals(s,"Not Present");
        s =b.checkExists("APPLE");
        Assert.assertEquals("Present" , s);

    }


}