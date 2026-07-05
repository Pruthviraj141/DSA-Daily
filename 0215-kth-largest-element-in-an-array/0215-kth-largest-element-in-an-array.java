class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int n : nums){
            if(k>heap.size()){
                heap.add(n);
            }else{
                if(heap.peek() < n){
                    heap.poll();
                    heap.add(n);
                }
            }
        }
            return heap.peek();

    }
}