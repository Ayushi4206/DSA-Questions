class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        String result = "";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                result += ch;
            }
            else if((ch=='-' || ch=='+') && result.isEmpty()){
                result += ch;
            }
            else{
                break;
            }
        }
        if(result.isEmpty() || result.equals("-") || result.equals("+")){
            return 0;
        }
        int number = 0;
        int sign = 1;
        int i = 0;
        if(result.charAt(0)=='-'){
            sign = -1;
            i++;
        }
        else if(result.charAt(0)=='+'){
            i++;
        }
        while(i<result.length()){
            int d=result.charAt(i)-'0';
            if(number > (Integer.MAX_VALUE-d)/10){
                if(sign==-1)
                    return Integer.MIN_VALUE;
                else
                    return Integer.MAX_VALUE;
            }
            number=number*10+d;
            i++;
        }
        return number*sign;
    }
}