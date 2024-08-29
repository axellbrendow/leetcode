package myjava;

// TIME LIMIT EXCEEDED
class LongestPalindromicSubstringV1 {
    public String longestPalindrome(String s) {
        // s = "", output = ""
        // s = "a", output = "a"
        // s = "ab", output = "a"
        // s = "abc", output = "a"
        // s = "abb", output = "bb"
        var longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                final var substr = s.substring(i, j);
                if (isPalindrome(substr) && substr.length() > longestPalindrome.length()) {
                    longestPalindrome = substr;
                }
            }
        }
        return longestPalindrome;
    }

    private boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
