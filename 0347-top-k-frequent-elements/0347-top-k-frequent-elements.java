class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //Store element with frequency
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Store on the basis of High Freq in priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int num : map.keySet()){
            //add all key in pq
            pq.offer(num);
            //if pq size greater than k, remove least freq element
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] result = new int[k];
        for(int i = 0; i<k; i++){
            result[i] = pq.poll();
        }

        return result;
        
        
    }
}