public class Solution {
  public boolean isPalindrome(String s) {
    String fixedStr = "";

    // Check if the string is alphanumeric
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c) || Character.isLetter(c)) {
        fixedStr += c;
      }
    }
    // convert fixed string to lowercase
    fixedStr = fixedStr.toLowerCase();

    // initialize sliding window
    int first = 0;
    int last = fixedStr.length() - 1;

    // loop until first is equals to the last
    while (first <= last) {

      // checks if the first and last character is not identical
      if (fixedStr.charAt(first++) != fixedStr.charAt(last++)) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.print(sol.isPalindrome("amanaplanacanalpanama"));
  }
}
