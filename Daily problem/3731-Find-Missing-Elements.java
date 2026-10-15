class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
            int cur=nums[i]+1;
            while(cur!=nums[i+1])
         { ll.add(cur); cur++;
            }
        
        }
        if(ll.size()>0) return ll;
        return new ArrayList<>();
    }
}