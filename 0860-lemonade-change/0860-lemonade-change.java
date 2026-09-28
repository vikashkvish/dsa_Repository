class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer,Integer> billsCollected = new HashMap<>();
        for(int index = 0; index< bills.length; index++){
            if(bills[index] == 5){
                billsCollected.put(5, billsCollected.getOrDefault(5, 0) + 1);
            }else if(bills[index] == 10){
                if(billsCollected.getOrDefault(5, 0)>= 1 ){
                    billsCollected.put(10, billsCollected.getOrDefault(10, 0) + 1);
                    billsCollected.put(5, billsCollected.getOrDefault(5, 0) - 1);
                   
                }else{
                    return false;
                }
            }else if(bills[index] == 20){
                if(billsCollected.getOrDefault(5,0) >= 1 && billsCollected.getOrDefault(10, 0) >= 1){
                    billsCollected.put(5, billsCollected.getOrDefault(5, 0) - 1);
                    billsCollected.put(10, billsCollected.getOrDefault(10, 0) - 1);
                }else if(billsCollected.getOrDefault(5,0) >= 3){
                    billsCollected.put(5, billsCollected.getOrDefault(5, 0) - 3);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}