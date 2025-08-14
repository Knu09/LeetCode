public class Solution_02 {
  public boolean isPalindromeNum(int x) {

    if (x < 0)
      return false; // return false since negative are not palindrome

    int original = x;
    int reversed_int = 0;

    // Reversed integer builder
    while (x != 0) {
      // Get the last digit of x and store in remainder
      int remainder = x % 10;

      // Removes the last digit of x
      x /= 10;

      // Build the reversed int by mutiplying the current and add the remainder
      reversed_int = reversed_int * 10 + remainder;
    }
    return original == reversed_int;
  }

  public static void main(String[] args) {
    Solution_02 sol = new Solution_02();
    System.out.println(sol.isPalindromeNum(12121));
  }
}
