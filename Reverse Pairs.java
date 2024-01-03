class Solution {

    public int countPairs(int[] nums, int start, int mid, int end){
        int count = 0;
        int itr1 = start;
        int itr2 = mid;
        while(itr1<mid){
            while(itr2<end && (long)nums[itr1]>2*(long)nums[itr2]){
                count += mid-itr1;
                itr2++;
            }
            itr1++;
        }
        return count;
    }

    public void merge(int[] nums, int start, int mid, int end){
        int[] temp = new int[end-start];
        int itr = 0;
        int itr1 = start;
        int itr2 = mid;
        while(itr<temp.length){
            if(itr1<mid && itr2<end){
                if(nums[itr1]<nums[itr2]){
                    temp[itr] = nums[itr1];
                    itr1++;
                }
                else{
                    temp[itr] = nums[itr2];
                    itr2++;
                }
            }
            else if(itr1<mid){
                temp[itr] = nums[itr1];
                itr1++;
            }
            else{
                temp[itr] = nums[itr2];
                itr2++;
            }
            itr++;
        }
        for(int i=0; i<temp.length; i++){
            nums[i+start] = temp[i];
        }
    }
    public int mergeSort(int[] nums, int start, int end){
        if(start>=end-1){
            return 0;
        }
        int mid = (start+end)/2;
        int count = mergeSort(nums, start, mid);
        count += mergeSort(nums, mid, end);
        count += countPairs(nums, start, mid, end);
        merge(nums, start, mid, end);
        return count;
    }
    public int reversePairs(int[] nums) {
        int numberOfReversePairs = mergeSort(nums, 0, nums.length);
        // for(int i=0; i<nums.length; i++){
        //     System.out.println(nums[i]);
        // }
        return numberOfReversePairs;
    }
}