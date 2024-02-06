package GraphProperties;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/path-with-maximum-gold/description/ [Path with maxm gold]
// https://leetcode.com/problems/number-of-islands/description/

class Store{
   private int first;
   private int second;

   public Store(int first, int second){
       this.first = first;
       this.second = second;
   }

   int getFirst(){
      return first;
   }

   int getSecond(){
     return second;
   }

    void setFirst(int first){
        this.first = first;
     }

    void setSecond(int Second){
        this.second = second;
    }
}


public class NoOfIslandsUsingBfs extends Graph {
    NoOfIslandsUsingBfs(int v){
        super(v);
    }

    public static void main(String[] args) {
        int mat[][] = {{1,1,0,1,0},
                       {1,1,0,0,1},
                       {0,0,0,0,0},
                       {0,0,0,1,1}};

        int m = mat.length;
        int n = mat[0].length;

        boolean visited[][] = new boolean[m][n];
        int count = 0;

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if((visited[i][j]==false) && mat[i][j] == 1) {
                    countIslands(mat, visited, i, j, m, n);
                    ++count;
                }
            }
        }

        System.out.println("No of Islands are as :- "+count);

    }

    private static void countIslands(int[][] mat, boolean[][] visited, int x, int y, int m, int n) {
        Queue<Store> q = new LinkedList<>();

        q.add(new Store(x,y));
        visited[x][y]=true;

        while(!q.isEmpty()){
            Store curr = q.poll();

            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    int row = curr.getFirst()+i;
                    int col = curr.getSecond()+j;
                   if(isIndixesValid(row,col,m,n) && visited[row][col]==false && mat[row][col]==1){
                       q.add(new Store(row,col));
                       visited[row][col] = true;
                   }
                }
            }

        }
    }

    private static boolean isIndixesValid(int x, int y, int m, int n) {
        if(x>=0 && y>=0 && x<m && y<n){
          return true;
        }
        return false;
    }
}
