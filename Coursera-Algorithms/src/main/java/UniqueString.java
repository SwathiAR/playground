import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by swathi on 11/20/2015.
 */
public class UniqueString {

    public boolean isUnique(String str){

        if(str==null ){
            return true;
        }
        char[] chars = str.toCharArray();

        for(int i =0 ;i<chars.length;i++){
            for(int j=i+1 ; j<chars.length ; j++){
                if(chars[i]==chars[j]){
                  return false;
                }
            }
        }
        return true;
    }


    public boolean isUniqueByDs(String str){

        char[] chars = str.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        for(char c : chars){
            boolean add = set.add(c);
            if(!add){
                return false;
            }
        }
      return true;
    }
    
public  boolean isUniqueBySizeComparision(String str){
    
    char[] chars = str.toCharArray();
    HashSet<Character> set = new HashSet<Character>();

    for(char c : chars){
        set.add(c);
    }

    return chars.length == set.size();

}


    public  boolean isUniqueBySizeBySorting(String str){
        if(str==null ){
            return true;
        }

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
         for(int i=0 ; i<chars.length-1 ;i++){
             if(chars[i]==chars[i+1]){
                 return  false;
             }

         }
         return true;
    }




}
