class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n  = mat.length;
        int m = mat[0].length;
        if((r*c) == (n*m))
        {   
            int stArr[] = new int[r*c];
            int arr[][] = new int[r][c];
            int count = 0;
            for(int i =0;i<n;i++)
            {
                for(int j =0;j<m;j++)
                {
                     stArr[count++] = mat[i][j];
                }
            }
            
            count =0;
            
            for(int i =0;i<r;i++)
            {
                for(int j =0;j<c;j++)
                {
                    arr[i][j] = stArr[count++] ;
                }
            }
            
            return arr;
            
        }else{
            return mat;
        }
        
    }
}