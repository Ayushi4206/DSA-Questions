class Solution {
    public int pivotIndex(int[] nums) {
      for(int i=0;i<nums.length;i++){
           int sumleft=0;
           int sumright=0;
            for(int j=0;j<i;j++){
                sumleft+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                sumright+=nums[k];
            }
        if(sumright==sumleft){
            return i;
        }
      } 
      return -1; 
    }
}