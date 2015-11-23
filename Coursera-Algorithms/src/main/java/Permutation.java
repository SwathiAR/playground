
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by swathi on 11/21/2015.
 */
public class Permutation {

    public boolean isPermutation(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }

        char[] chars = str.toCharArray();
        char[] chars1 = str2.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);

        return Arrays.equals(chars, chars1);
    }


    public boolean isPermutation2(String str, String str2) {
        if (str == null || str2 == null || str.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (map1.containsKey(str.charAt(i))) {
                map1.put(str.charAt(i), map1.get(str.charAt(i)) + 1);
            } else
                map1.put(str.charAt(i), 1);

        }

        for (int i = 0; i < str2.length(); i++) {
            if (map1.containsKey(str2.charAt(i))) {
                map1.put(str.charAt(i), map1.get(str.charAt(i)) - 1);
            } else
                map1.put(str.charAt(i), -1);

        }

        for (Integer i : map1.values()) {
            if (i != 0) {
                return false;
            }
        }


        return true;
    }

}
