class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int n : nums){
            freqMap.put(n, freqMap.getOrDefault(n,0) +1);
        }

        Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> freqMap.get(a)-freqMap.get(b));

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            minHeap.offer(entry.getKey());
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = minHeap.poll();
        }
        return result;
    }
}
