/**
 * Created by swathi on 11/21/2015.
 */
public class StringToInteger {

    public int convertSringToint(String str) {
        boolean isNegative = false;

        if (str == null || str.equals("")){
            return -1;
        }
        if (str.charAt(0) == '-') {
            isNegative = true;

        }

        int base = 1;
        int result = 0;

        int till = isNegative ? 1 : 0;
        for (int i = (str.length() - 1); i >= till; i--) {
            result = result + ((str.charAt(i))-48) * base;
            base = base * 10;
        }
        if (isNegative) {
            return -1 * result;
        } else
            return result;
    }
}
