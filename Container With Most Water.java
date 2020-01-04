
// Recursive Approach - 100% time, 77% space.
class Solution {
    public int maxArea(int[] h) {
        int result = 0;
        return getResult(h, 0, h.length-1, result);    
    }
    
    public int getResult(int[] h, int i, int j, int result){
        if(i >= j) return result;
        result = Math.max(result, Math.min(h[j], h[i]) * (j - i));
        if(h[i] <= h[j]) return getResult(h, ++i, j, result);
        else return getResult(h, i, --j, result);
    }
}


//Iterative approach - 95% time, 88% space.
class Solution {
    public int maxArea(int[] h) {
        int i = 0, j = h.length-1;
        int result = 0;
        
        while(i != j){
            result = Math.max(result, Math.min(h[j], h[i]) * (j - i));
            if(h[i] <= h[j]) i++;
            else j--;
        }
        return result;
    }
}
