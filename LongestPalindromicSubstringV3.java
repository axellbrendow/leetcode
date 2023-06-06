class LongestPalindromicSubstringV3 {
    private static String longestPalindromeStartingFrom(int i, int j, String originalString) {
        var longestPalindrome = "";
        while (i >= 0 && j < originalString.length() && originalString.charAt(i) == originalString.charAt(j)) {
            longestPalindrome = originalString.substring(i, j + 1);
            i--;
            j++;
        }
        return longestPalindrome;
    }

    public static String longestPalindrome(String s) {
        var longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {
            final var longestPalindromeWithOddLength = longestPalindromeStartingFrom(i, i, s);
            final var longestPalindromeWithEvenLength = longestPalindromeStartingFrom(i, i + 1, s);
            if (longestPalindromeWithOddLength.length() > longestPalindrome.length()) {
                longestPalindrome = longestPalindromeWithOddLength;
            }
            if (longestPalindromeWithEvenLength.length() > longestPalindrome.length()) {
                longestPalindrome = longestPalindromeWithEvenLength;
            }
        }

        return longestPalindrome;
    }

    public static void main(String[] args) {
        var testNumber = 0;

        var input = "babad";
        var expectedOutpupt = "bab";
        var output = longestPalindrome(input);
        var testPassed = output.equals(expectedOutpupt);
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));

        input = "cbbd";
        expectedOutpupt = "bb";
        output = longestPalindrome(input);
        testPassed = output.equals(expectedOutpupt);
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));
    }
}