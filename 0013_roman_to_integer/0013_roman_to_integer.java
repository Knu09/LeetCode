import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToInteger = new HashMap <Character, Integer>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        int length = s.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            int current = romanToInteger.get(s.charAt(i));
            int next = (i + 1 < length) ? romanToInteger.get(s.charAt(i + 1)) : 0;
            if(current < next ) {
                result += next - current;
                i++;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static void main (String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("IVII"));
    }

}
