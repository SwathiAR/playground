/**
 * Created by swathi on 9/1/2015.
 */
public class KCombinationOfStringOfLegthN {

    public void generateCombination( String s , int k  ) {
        char[] chars = s.toCharArray();
        int n = s.length();
         generate(chars , n , k , "");
    }



        private void generate(char[] chars , int  n , int k , String prefix  ) {


            if (k == 0) {
                System.out.println(prefix);
            } else {
                for (int j = 0; j < n; j++) {
                    String newPrefix = prefix + chars[j];
                    generate(chars , n , k-1 , newPrefix);

                }
            }
        }

    }



