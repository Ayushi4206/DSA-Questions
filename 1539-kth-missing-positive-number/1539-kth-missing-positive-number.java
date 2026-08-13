class Solution {
    public int findKthPositive(int[] arr, int k) {
        int temp[]=new int[2000];
        int l=0;
        for(int i=1;;i++){
           int target= BinarySearch(i,arr);
           if(target==-1){
             temp[l]=i;
             l++;
           }
           if(l==k){
            break;
           }
        }
           return temp[k-1];
        }
        
    public int BinarySearch(int i,int[] arr){
            int j=0;
            int k=arr.length-1;
            while(j<=k){
                int mid=(j+k)/2;
                if(i<arr[mid]){
                    k=mid-1;
                }
                else if(i>arr[mid]){
                    j=mid+1;
                }
                else{
                    return mid;
                }
            }
        return -1;
        }
}