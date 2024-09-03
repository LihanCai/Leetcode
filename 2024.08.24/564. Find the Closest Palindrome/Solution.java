class Solution {
    public String nearestPalindromic(String n) {
        long nl = Long.parseLong(n);
        int len = n.length();
        if (nl <= 10 || (nl % 10 == 0 && n.charAt(0) == '1' && Long.parseLong(n.substring(1)) == 0)) {
            return "" + (nl - 1);
        }
        if (nl == 11 || (nl % 10 == 1 && n.charAt(0) == '1' && Long.parseLong(n.substring(1, len - 1)) == 0)) {
            return "" + (nl - 2);
        }
        if (isAllDigitNine(n)) {
            return "" + (nl + 2);
        }
        boolean isEvenDigits = len % 2 == 0;
        String palindromeRootStr = (isEvenDigits) ? n.substring(0, len / 2) : n.substring(0, len / 2 + 1);

        int palindromeRoot = Integer.valueOf(palindromeRootStr);
        long equal = toPalindromeDigits("" + palindromeRoot, isEvenDigits);
        long diffEqual = Math.abs(nl - equal);

        long bigger = toPalindromeDigits("" + (palindromeRoot + 1), isEvenDigits);
        long diffBigger = Math.abs(nl - bigger);

        long smaller = toPalindromeDigits("" + (palindromeRoot - 1), isEvenDigits);
        long diffSmaller = Math.abs(nl - smaller);

        //
        // Find the palindrome with minimum absolute differences
        // If tie, return the smaller one
        //
        long closest = (diffBigger < diffSmaller) ? bigger : smaller;
        long minDiff = Math.min(diffBigger, diffSmaller);

        if (diffEqual != 0) { // n is not a palindrome, diffEqual should be considered
            if (diffEqual == minDiff) { // if tie
                closest = Math.min(equal, closest);
            } else if (diffEqual < minDiff) {
                closest = equal;
            }
        }

        return "" + closest;
    }

    private long toPalindromeDigits(String num, boolean isEvenDigits) {
        StringBuilder reversedNum = new StringBuilder(num).reverse();
        String palindromeDigits = isEvenDigits
                ? num + reversedNum.toString()
                : num + (reversedNum.deleteCharAt(0)).toString();
        return Long.parseLong(palindromeDigits);
    }

    private boolean isAllDigitNine(String n) {
        for (char ch : n.toCharArray()) {
            if (ch != '9') {
                return false;
            }
        }
        return true;
    }
}