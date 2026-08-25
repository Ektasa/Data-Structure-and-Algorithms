class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
         reverse(nums,0,k-1);
         reverse(nums,k,n-1);
    }
    public void reverse(int[] arr,int o,int n){
                     
           while(o<n)
           {
            int temp=arr[o];
            arr[o]=arr[n];
            arr[n]=temp;

            o++;
            n--;
           }
        

    }
}