import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by swathi on 6/17/2015.
 */
public class ConflictingObjectiveImpl {

    public void selectSixLetterWords(){
        URL url = null;
        try {
            url = new URL("http://codekata.com/data/wordlist.txt");
            Scanner inputStream = new Scanner(url.openStream());
            while(inputStream.hasNextLine()){





            }









        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
