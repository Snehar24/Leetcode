class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i:nums){
            pq.add(i);
        }
        int first=pq.poll();
        int second=pq.poll();
        return (first-1)*(second-1);
    }
}