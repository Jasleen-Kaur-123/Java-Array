class Solution {
    public static void main(String[] args){
        int[][] matrix = {{3,4,7,9},
                          {12,13,16,18},
                          {20,21,23,29}};
        int target = 2;
        Solution s = new Solution();
        boolean result = s.searchMatrix(matrix,target);
        System.out.println(result);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0 , high = m * n - 1;
        while(low<=high){
        int mid = (low+high) / 2;
        int row = mid / m;
        int col = mid % m;
        if(matrix[row][col]==target) return true;
        else if(matrix[row][col]<target) low = mid + 1;
        else high = mid - 1;
        } 
        return false;
    }
}