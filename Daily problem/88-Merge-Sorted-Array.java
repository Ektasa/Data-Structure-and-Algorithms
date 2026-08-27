class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums1[i]>nums2[j])
                  {
                    int temp=nums2[j];
                    nums2[j]=nums1[i];
                    nums1[i]=temp;
                  }
            }
        }
        int l=0;
        for(int i=m;i<nums1.length;i++)
        {
            nums1[i]=nums2[l++];
        }
        Arrays.sort(nums1);
    }
}