import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by swathi on 11/22/2015.
 */
public class BiggestWordInTheSentence {

    public int getBiggestwordcount(String str){

        if(str==null || str.equals("")){
            return 0;
        }

        String[] words = str.split(" ");
        TreeMap<Integer , String> tree = new TreeMap<Integer, String>();
       for(String word : words){
           tree.put(word.length() , word);
       }
        return tree.lastKey();

    }


    public  int getBiggestwordcount2(String str){


        if(str==null || str.equals("")){
            return 0;
        }

        int higestCount = 0;
        int count =0;
        for(int i =0  ; i<str.length();i++ ){

            if(str.charAt(i) == ' '){
                if(higestCount < count){
                    higestCount = count;
                }

                count= 0;
            }
         else count++;
        }

        
        return higestCount>count? higestCount:count;


    }





}
