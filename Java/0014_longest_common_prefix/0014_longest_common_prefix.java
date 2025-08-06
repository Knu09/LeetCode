import java.utils.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix)) {
                prefix = prefix.substring(0, str.length() - 1);
                System.out.println(prefix);
            }
        }
        return prefix;
    } 

    public static void main(String[] args) {
        Solution sol = new Solution();
        String [] str = {"flower", "flow", "flight"};
        System.out.println(sol.longestCommonPrefix(str));
    }
}
