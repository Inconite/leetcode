
class Solution {
    public int romanToInt(String s) {

        int n = s.length() - 1;
        int totalVal = getCharVal(s.charAt(n)); // initially the totalVal is initialized to the last char.
        
        for(int i = n; i > 0; i--){
            
            int nextChar = getCharVal(s.charAt(i)); 
            int prevChar = getCharVal(s.charAt(i - 1));
            
            if(nextChar > prevChar){
                totalVal -= prevChar;
            }else{
                totalVal += prevChar;
            }
            
        }
        return totalVal; 
    }
    
    static int getCharVal(char currentChar){
        switch(currentChar){
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
        }
    }
    
}
