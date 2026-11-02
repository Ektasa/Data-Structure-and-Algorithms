import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        List<BigInteger> pq=new ArrayList<>(k);

        for(int i=0;i<nums.length;i++)
        {
           String s=nums[i];
           BigInteger big=new BigInteger(s);
           pq.add(big);

        }
        Collections.sort(pq);
        return pq.get(pq.size()-k).toString();
    }
}