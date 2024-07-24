class LongestPalindromicSubstringV2 {
    public static String longestPalindrome(String s) {
        final var isPalindromeBetween = new boolean[s.length()][s.length()];
        var longestPalindrome = "";

        for (int currLength = 1; currLength <= isPalindromeBetween.length; currLength++) {
            for (int start = 0; start < isPalindromeBetween.length - currLength + 1; start++) {
                final var end = start + currLength - 1;
                isPalindromeBetween[start][end] = s.charAt(start) == s.charAt(end) && (currLength == 1 ||
                    currLength == 2 || isPalindromeBetween[start + 1][end - 1]);

                if (isPalindromeBetween[start][end] && currLength > longestPalindrome.length()) {
                    longestPalindrome = s.substring(start, end + 1);
                }
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
