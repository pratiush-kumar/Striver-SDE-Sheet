class Solution {
    public void reverseArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int breakpoint = -1;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                breakpoint = i-1;
                break;
            }
        }
        if(breakpoint == -1){
            reverseArray(nums, 0, nums.length-1);
            return;
        }
        for(int i=nums.length-1; i>breakpoint; i--){
            if(nums[i]>nums[breakpoint]){
                int temp = nums[i];
                nums[i] = nums[breakpoint];
                nums[breakpoint] = temp;
                break;
            }
        }
        reverseArray(nums, breakpoint+1, nums.length-1);
        return;
    }
}