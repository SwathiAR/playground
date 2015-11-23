        /**
         * Created by swathi on 9/21/2015.
         */
        public class ReverseLonger {

            public static String shorterReverseLonger(String a, String b) {

                if (a == null || b == null) {
                    return null;
                }
                if (a.equals("") && a.equals("")) {
                    return "";
                }

                if ((a.length() >= b.length())) {
                    return b + reverse(new StringBuilder(a)) + b;
                } else {
                    return a + reverse(new StringBuilder(b)) + a;
                }

            }

            private static String reverse(StringBuilder c) {

                if (c.length() <= 1) {
                    return c.toString();
                } else {
                    char firstChar = c.charAt(0);
                    return reverse(c.deleteCharAt(0)) + firstChar;
                }

            }
        }
