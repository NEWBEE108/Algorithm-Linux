package Lintcode.Base.Ladders.BinarySearchLadder;

public class SearchMatrix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		
		int start = 0, end = matrix.length * matrix[0].length - 1;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			int val = matrix[mid / matrix[0].length][mid % matrix[0].length];
			if(target == val){
				return true;
			}else if (target < val){
				end = mid;
			}else{
				start = mid;
			}
		}
		
		if (matrix[start / matrix[0].length][start % matrix[0].length] == target 
				|| matrix[end / matrix[0].length][end % matrix[0].length] == target){
			return true;
		}else{
			return false;	
		}
    }
}
