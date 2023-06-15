class Solution {
    public void sortColors(int[] nums) {
        int itr = 0;
        int zeroHead = 0;
        int oneTail = nums.length-1;
        while(itr<=oneTail){
            if(nums[itr]==0){
                if(itr==zeroHead){
                    itr++;
                }
                else{
                    nums[itr] = nums[zeroHead];
                    nums[zeroHead] = 0;
                }
                zeroHead++;
            }
            else if(nums[itr]==1){
                itr++;
            }
            else if(nums[itr]==2){
                nums[itr] = nums[oneTail];
                nums[oneTail] = 2;
                oneTail--;
            }
        }
    }
}