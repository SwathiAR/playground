/**
 * Created by swathi on 11/21/2015.
 */
public class StringCompression {

    public String compressString(String str) {

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {


            if (str.charAt(i) == str.charAt(i + 1) && count == 1) {
                sb.append(str.charAt(i));
                ++count;

            } else if (str.charAt(i) == str.charAt(i + 1) && count > 1) {

                ++count;

            } else if (str.charAt(i) != str.charAt(i + 1) && count == 1) {
                sb.append(str.charAt(i));
            } else if (str.charAt(i) != str.charAt(i + 1) && count > 1) {
                sb.append(count);
                count = 1;

            }


        }

        if (count > 1) {
            sb.append(count);
        }
        return String.valueOf(sb);


    }


    public String compressString2(String str) {

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if(count>1) sb.append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        if(count>1) sb.append(count);
        return sb.toString();
    }
}
