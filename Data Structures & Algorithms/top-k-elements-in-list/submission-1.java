class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            minHeap.offer(new int[]{entry.getValue(),entry.getKey()});
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] res = new int[k];
        int i =0;
        for(int[] n : minHeap){
            res[i++]=n[1];
        }
        
        return res;
    }
}
