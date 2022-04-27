class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        for(int i =0; i<size;i++)
        {
            int temp[] = new int[size];
            int count =0;
            
            //storing in new array
            for(int j =size-1; j>=0;j--)
            {
                temp[count++] = image[i][j];
            }
            
            //inverting
            for(int j = 0; j<size;j++)
            {
               if(temp[j] == 0)
               {
                   image[i][j] = 1;
               }else{
                   image[i][j] = 0;
               }
            }
        }
        return image;
    }
}