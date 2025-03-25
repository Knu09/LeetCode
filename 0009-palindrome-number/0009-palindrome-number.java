class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();

        for (int i = 0; i < n/2; i++) {
            System.out.println(n-i-1);
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
}