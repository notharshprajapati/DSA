class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) 
    { 
       
        int m = matrix.size();
        int n = matrix[0].size();
        
        int arr[m][n];
         for(int i=0 ; i<m;i++)
        {
           for(int j=0 ; j<n;j++) 
           {
                arr[i][j]=1;
           }
        } 
      
        
        
        for(int i=0 ; i<m;i++)
        {
           for(int j=0 ; j<n;j++) 
           {
               if(matrix[i][j]==0)
                   arr[i][j]=0;
           }
        }  
        
        
        
         for(int i=0 ; i<m;i++)
        {
           for(int j=0 ; j<n;j++) 
           {
               if(arr[i][j]==0)
               {
                   for(int a=0 ; a<m;a++)
                    {
                        matrix[a][j]=0;
                    }
                   for(int b=0 ; b<n;b++) 
                    {
                        matrix[i][b]=0;
                    }
               }
           }
        }  
    }
};