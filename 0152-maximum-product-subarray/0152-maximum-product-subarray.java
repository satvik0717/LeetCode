class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxprod = nums[0];
        int minprod = nums[0];
        int ans =nums[0];

        for(int i=1;i<n;i++){
           int curr = nums[i];
           int newMax = Math.max(curr,Math.max(maxprod*curr,minprod*curr));
           int newMin = Math.min(curr,Math.min(maxprod*curr,minprod*curr));
           maxprod = newMax;
           minprod = newMin;
           ans = Math.max(ans,maxprod);
        }
        return ans;
    }
}