class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int i = 0; i < n; i++)
        {
            int k = 0;
            int l = n-1;
            while(k <= l)
            {
                int tmp = matrix[i][k];
                matrix[i][k] = matrix[i][l];
                matrix[i][l] = tmp;

                k++;
                l--;
            }
        }
    }
}