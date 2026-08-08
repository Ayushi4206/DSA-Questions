class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        int j=nums.length-1;
        if(nums.length==1){
            return 0;
        }
        else  if(nums[0]>nums[1]){
            return 0; 
        }
        else if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int mid=(i+j)/2;
        int p=PeakElement1(mid,nums);
        int q=PeakElement2(mid+1,nums);
        if(p!=-1){
            return p;
        }
        else if(q!=-1){
            return q;
        }
        else{
            return -1;
        }
    }
    public int PeakElement1(int j, int[] nums){
        for(int i=1;i<=j;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }
        return -1;
    }
    public int PeakElement2(int i, int[] nums){
        while(i<nums.length-1){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
         i++;
        }
        return -1;
    }
}