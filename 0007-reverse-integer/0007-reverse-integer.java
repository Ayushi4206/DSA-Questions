class Solution {
    public int reverse(int x) {
        int temp=0;
        int a;
        while(x!=0){
            if (temp > Integer.MAX_VALUE/10 || temp < Integer.MIN_VALUE/10) return 0;
            a=x%10;
            temp=temp*10+a;
            x=x/10;
        }
        return temp;
    }
}