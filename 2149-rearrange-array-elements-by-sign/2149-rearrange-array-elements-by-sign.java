class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int temp1[]=new int[n/2];
        int temp2[]=new int[n/2];
        int pos=0;int neg=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0)
            temp1[pos++]=nums[i];
            else
            temp2[neg++]=nums[i];
        }
        for(int i=0;i<n/2;i++){
            nums[2*i]=temp1[i];
            nums[2*i+1]=temp2[i];
        }
        return nums;
    }
}