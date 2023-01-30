package CommonCodes;

/* https://leetcode.com/problems/number-of-islands/ */
/*Given an m x n 2D binary grid, grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 You may assume all four edges of the grid are all surrounded by water.*/

public class NumberOfIsland {
    public static void main(String[] args) {
        int island[][] = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,1,0,1}};
        int totalCount = findIsland(island);

        System.out.println("Total Count of Islands "+ totalCount);
    }

    private static int findIsland(int[][] island) {
        int m = island.length;
        int n = island[0].length;

        int total = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(island[i][j] == 1){
                  countIslands(island,i,j,m,n);
                  ++total;
                }
            }
        }
      return total;
    }

    private static void countIslands(int[][] island, int i, int j, int m, int n) {
        if(i<0 || j<0 || i>=m || j>=n || island[i][j]!=1){
            return;
        }

        island[i][j] = 2;

        countIslands(island,i,j-1,m,n);
        countIslands(island,i,j+1,m,n);
        countIslands(island,i-1,j,m,n);
        countIslands(island,i+1,j,m,n);
    }
}
