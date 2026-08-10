class Solution {

    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int left = 1;
        int right = 0;
        for(int day : bloomDay){
            right = Math.max(right, day);
        }
        int answer = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(canMake(bloomDay, mid, m, k)){
                answer = mid;
                right = mid - 1;

            }
            else{
                left = mid + 1;
            }
        }
        return answer;
    }

    public boolean canMake(int[] bloomDay, int day, int m, int k){
        int flowers = 0;
        int bouquets = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= day){
                flowers++;
                if(flowers == k){
                    bouquets++;
                    flowers = 0;
                }
            }
            else{
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}