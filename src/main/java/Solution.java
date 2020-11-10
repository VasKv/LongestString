import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by VasKv
 * 10.11.2020
 */
public class Solution {
    public static void main(String[] args) {
        String[] testData = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        System.out.println(longestString(testData, 2));
    }

    public static String longestString(String[] arr, int k) {
        SortedSet<String> setStrings = new TreeSet<String>();
        StringBuilder sb = new StringBuilder();
        int numStr = arr.length - k;
        String[] longest = new String[1];

        for (int i = 0; i <= numStr; i++) {
            sb.delete(0, sb.length());

            for (int s = i; s < i + k; s++) {
                sb.append(arr[s]);
            }

            setStrings.add(sb.toString());
        }

        int maxLen = 0;
        for (String n : setStrings) {
            int len = n.length();
            if (maxLen == 0 || len > maxLen) {
                longest[0] = n;
                maxLen = len;
            }
        }

        return longest[0];
    }
}
