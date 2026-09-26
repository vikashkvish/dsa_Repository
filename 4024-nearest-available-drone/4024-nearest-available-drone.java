class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int minimumDistance = Integer.MAX_VALUE;
        int ResultIndex = -1;
        for(int index = 0; index<drones.length; index++){
            int X = drones[index][0];
            int Y = drones[index][1];
            int Range = drones[index][2];
            int Distance = Math.abs(X - target[0]) + Math.abs(Y - target[1]);
            if(Distance <= Range){
                if(Distance < minimumDistance){
                    minimumDistance = Distance;
                    ResultIndex = index;
                }
            }
        }
        return ResultIndex;
        
    }
}