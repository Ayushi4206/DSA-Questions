class Solution {
    public boolean isPalindrome(String s) {
    String str = s.replaceAll("[^a-zA-Z0-9]", "");
    String string=str.toLowerCase();
     int i=0,j=string.length()-1;
     while(i<j){
        if(string.charAt(i)!=string.charAt(j)){
            return false;
        }
        i++;j--;
     }
     return true;  
    }
}