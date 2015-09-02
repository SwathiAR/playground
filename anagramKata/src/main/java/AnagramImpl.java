import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * Created by swathi on 6/17/2015.
 */
public class AnagramImpl implements Anagram {

    private Map<String , ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    public  ArrayList<String> anagrams;

    public AnagramImpl(){
        storeAnagrams();

    }


    private void storeAnagrams()  {

        try {
           URL url = new URL("http://codekata.com/data/wordlist.txt");
            Scanner inputStream = new Scanner(url.openStream());
            inputStream.hasNextLine();
            while(inputStream.hasNextLine()){
                String word = inputStream.nextLine();
                String key = sort(word);
                anagrams = map.get(key);
                if (map.get(key)==null) {
                    anagrams = new ArrayList<String>();
                }
                anagrams.add(word);
                map.put(key, anagrams);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String sort(String word) {

        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }

    public ArrayList<String> giveAnagram(String s){
        System.out.println(map);
        return  map.get( sort( s.toLowerCase()));



    }
}
