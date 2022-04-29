class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n  = mat.length;
        int m = mat[0].length;
        
        if((r*c) != (n*m))  return mat;

        int arr[][] = new int[r][c];
        for(int i =0;i<r*c;i++)
        {
            arr[i/c][i%c] = mat[i/m][i%m];
        }
        
        return arr;
        
    }
}