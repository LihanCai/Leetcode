public class Solution {
    private final String[] LESS_THAN_TEN = new String[] { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine" };
    private final String[] LESS_THAN_Twenty = new String[] { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    private final String[] TENS = new String[] { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety" };

    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";
        return helper(num);
    }

    private String helper(int num) {
        String result = new String();
        if (num < 10)
            result = LESS_THAN_TEN[num];
        else if (num < 20)
            result = LESS_THAN_Twenty[num - 10];
        else if (num < 100)
            result = TENS[num / 10] + " " + helper(num % 10);
        else if (num < 1000)
            result = helper(num / 100) + " Hundred " + helper(num % 100);
        else if (num < 1000000)
            result = helper(num / 1000) + " Thousand " + helper(num % 1000);
        else if (num < 1000000000)
            result = helper(num / 1000000) + " Million " + helper(num % 1000000);
        else
            result = helper(num / 1000000000) + " Billion " + helper(num % 1000000000);
        return result.trim();
    }
}