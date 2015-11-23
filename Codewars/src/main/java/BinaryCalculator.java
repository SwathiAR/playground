import java.util.ArrayList;

/**
 * Created by swathi on 9/19/2015.
 */
public class BinaryCalculator {
    public static String calculate(final String n1, final String n2, final String o) {

        if (n1 == null || n2 == null || n1.equals("") || n2.equals("")) {
            return "0";
        }
        int decN1 = getDec(n1);
        int decN2 = getDec(n2);
        System.out.println(decN1);
        System.out.println(decN2);
        int decCalculate = 0;

        if (o.equals("add")) {
            decCalculate = decN1 + decN2;

        }

        if (o.equals("subtract")) {
            decCalculate = decN1 - decN2;
        }

        if (o.equals("multiply")) {
            decCalculate = decN1 * decN2;
        }

        if (!(o.equals("add") || o.equals("subtract") || o.equals("multiply"))) {
            return "0";
        }

        return getString(decCalculate);

    }


    private static int getDec(String n1) {

        boolean isNegative = false;
        int initialI = 0;

        char[] charN1 = n1.toCharArray();
        if (charN1[0] == '-') {
            isNegative = true;
            initialI = 1;
        }

        int decN1 = 0;
        int index = charN1.length-initialI;

        for (int i=initialI; i < charN1.length; i++,index--) {
            int i1;
            try {
                i1 = Integer.parseInt(String.valueOf(charN1[i]));
            } catch (NumberFormatException e) {
                return 0;
            }
            decN1 = decN1 + (int) (i1 * Math.pow(2, index - 1));
        }
        return isNegative ? decN1 * -1 : decN1;


    }

    private static String getString(int decCalculate) {
        boolean isNegative = decCalculate < 0;
        int absValue = Math.abs(decCalculate);
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (; absValue > 0; ) {
            al.add(absValue % 2);
            absValue = absValue / 2;

        }

        if (al.size() > 0) {
            String alInString = al.get(al.size() - 1).toString();
            for (int i = al.size() - 2; i >= 0; i--) {
                alInString = alInString + al.get(i).toString();
            }
            return (isNegative ? "-" : "") + alInString;
        }

        return "0";
    }

}
