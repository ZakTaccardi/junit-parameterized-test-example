/**
 * Utilities for manipulating text.
 */
public class MyTextUtils {

    /**
     * Turns "1234567890123456" into "1234 5678 9012 3456". Useful for credit card formatting.
     *
     * @param s   String to format
     * @param num Group size
     */
    public static String addSpaceInterval(String s, int num) {

        if (s.length() <= num) {
            //String to small, do nothing
            return s;
        }

        //remove spaces
        StringBuilder sb = new StringBuilder(s.replaceAll(" ", "").trim());

        int spaces = 0;
        for(int i = num; i <= sb.length() - 1; i += num) {
            //we don't want to add a space to the end
            if (i + spaces < sb.length()){
                sb.insert(i + spaces, " ");
                spaces++;
            }
        }

        return sb.toString();
    }
}