class Solution {
    public void reverse(int nums[] , int s , int e){
        while(s<=e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
    public void rotate(int[][] matrix) {
        
        for(int i =0 ; i< matrix.length ; i++){
            for(int j = i+1 ; j < matrix[0].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp ;
            }
        }

        for(int i =0 ; i< matrix.length ; i++){

            reverse(matrix[i] , 0 , matrix[0].length-1);
        }
        
    }
}
