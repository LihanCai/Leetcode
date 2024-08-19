class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                five++;
            } 
            if(bills[i] == 10){
                ten++;
                if(five >= 0){
                    five--;
                }
                else return false;
            } 
            if(bills[i] == 20){
                twenty++;
                if(five >= 1 && ten >= 1){
                    five--;
                    ten--;
                }
                else if(five >= 3){
                    five -= 3;
                }
                else return false;
            }
        }
        return true;
    }
}