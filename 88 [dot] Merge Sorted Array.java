class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int itr1 = m-1;
        int itr2 = n-1;
        int itr = m+n-1;
        while(itr1>=0 || itr2>=0){
            if(itr1>=0 && itr2>=0){
                if(nums1[itr1]>nums2[itr2]){
                    nums1[itr] =  nums1[itr1];
                    itr1--;
                }
                else{
                    nums1[itr] = nums2[itr2];
                    itr2--;
                }
            }
            else if(itr1>=0){
                nums1[itr] = nums1[itr1];
                itr1--;
            }
            else{
                nums1[itr] = nums2[itr2];
                itr2--;
            }
            itr--;
        }
    }
}