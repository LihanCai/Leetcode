class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s : details){
            int num1 = s.charAt(11) - '0';
            int num2 = s.charAt(12) - '0';
            if(num1 * 10 + num2 > 60) count++; 
        }
        return count;
    }
}