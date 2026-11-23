class Solution {
    public int findNumbers(int[] nums) {
        int freq=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int j=nums[i];
            while(j>0){
                count++;
                j=j/10;
            }
            if(count%2==0){
                freq++;
            }
        }
        return freq;
    }
}