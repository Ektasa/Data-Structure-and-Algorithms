class KthLargest {
    int kk;
     PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
       
       
            // if(pq.length()<k && pq.peek()<nums[i] )
            // {
            kk=k;
            pq=new PriorityQueue<>();
            for(int i:nums)
                pq.offer(i);
           

        

        
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size()!=kk)
        {pq.poll();}
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */