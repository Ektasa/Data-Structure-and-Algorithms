class Solution {
    public int rangeBitwiseAnd(int left, int right) {
      if(left==0){ return 0;}
        int result=1;
        while(left!=right)
        {
           left>>=1;
           right>>=1;
           result<<=1;
        }
        return left*result;
    }
}