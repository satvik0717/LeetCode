class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1)return true;
        int low = 1;
        int high = num;
       
        while(low<=high){
            int mid = low + (high - low)/2;
            long squ = (long)mid * mid;
            if(squ == num){
                return true;
            }else if(squ < num){
               low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}