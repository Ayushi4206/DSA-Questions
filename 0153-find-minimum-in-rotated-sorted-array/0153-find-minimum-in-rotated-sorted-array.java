class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MIN_VALUE;
        int i=0;
        int j=nums.length-1;
        /*while(i<j){
            if(min<nums[i]||min<nums[j]){
              if(nums[i]<nums[j]){
                min=nums[i];
              }
              else{
                min=nums[j];
              }
            }
            i++;
            j--;
        }
        return min;*/
        /*while(i<j){
            int mid=(i+j)/2;
            if(min<nums[i]||min<nums[mid]||min<nums[j]){
                if(nums[i]<nums[mid]&&nums[i]>nums[j]){
                    min=nums[i];
                }
                else if(nums[j]>nums[i]&& nums[j]>nums[mid]){
                    min=nums[j];
                }
                else{
                    min=nums[mid];
                }
            }
            i++;
            j--;
        }
        return min;*/
        Arrays.sort(nums);
        return nums[0];
    }
}