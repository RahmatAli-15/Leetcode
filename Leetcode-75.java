75. Sort Colors

  class Solution {
    public void sortColors(int[] nums) {
        //here we use dutch natioanl flag algo
        int low=0;
        int mid=0;
        int high=nums.length-1;
        
        //condition
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;

            }else if(nums[mid]==1){
                mid++;
            }else{//nums[mid]==2
                swap(nums,mid,high);
                high--;
            }
        }

       //no need of return bcz of void
     }

    public void swap(int nums[], int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}
