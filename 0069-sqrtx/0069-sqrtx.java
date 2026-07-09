class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1)return x;
        int low = 1;
        int high = x;
        int ans = 0;

        while(low<=high){
            int mid = low+(high-low)/2;
            long squ = (long)mid * mid;
            if(squ == x){
                return mid;
            }else if(squ < x){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
         }
         return ans;
    }
}