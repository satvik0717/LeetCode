class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[]row : matrix){
            if(target >= row[0]  && target <= row[row.length-1]){
                int low = 0;
                int high= row.length - 1;
                 while(low<= high){
                    int mid = low + (high - low)/2;
                    if(row[mid] == target){
                        return true;
                    }else if(row[mid] < target){
                        low = mid + 1;
                    }else{
                        high = mid - 1;
                    }
                 }
            }
        }
        return false;
    }
}