class Solution {
    public boolean isPalindrome(int x) {
        int palindrome=0;
        int a;
        int b=x;
        while(x!=0){
            if(x<0){
                return false;
            }
            a=x%10;
            palindrome=palindrome*10+a;
            x=x/10;
        }
        if(palindrome==b){
            return true;
        }
        else{
            return false;
        }
    }
}