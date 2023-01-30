package CommonCodes;

/* Maximum time required for all patients to get infected
https://www.geeksforgeeks.org/maximum-time-required-for-all-patients-to-get-infected/
 */

// BFS used

/* Dry-run Steps
1. put all positions(i,j) which has 2(infected) to the queue with initial time as 0(zero)
2. also, count the uninfected(1) such that after applying bfs, we can deduce that all converted to affected or not from uninfected
3. take out array element based on indices from queue and check all four direction, is this 1(uninfected) or not
4. each time increase time to +1
 */



import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int first, second, third;

    Pair(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
}


public class CovidProblem {
    public static void main(String[] args) {
        int arr[][] = { { 2, 1, 0, 2, 1 },
                        { 1, 0, 1, 2, 1 },
                        { 1, 0, 0, 2, 1 } }; // should return 0

      /*  int arr[][] = { {2, 1, 0, 2, 1},
                        {0, 0, 1, 2, 1},
                        {1, 0, 0, 2, 1}}; // should return -1*/

        int maxTime = findMaxTime(arr);
        System.out.println("Unit of time takes to infected:- "+maxTime);
    }

    private static int findMaxTime(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;
        int time = 0;

        Queue<Pair> q = new LinkedList<>();
        int visited[][] = new int[m][n];
        int distance[][] = {{0,-1},{0,1},{-1,0},{1,0}};

        int uninfected = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                if(arr[i][j] == 2){
                  q.add(new Pair(i,j,0));
                    visited[i][j] = 1;
                }

                if(arr[i][j] == 1){
                    ++uninfected;
                }

            }
        }

        while(!q.isEmpty()){
            Pair current = q.peek();
            q.poll();

            time = current.third;

            for(int it[] : distance ){
                int i = it[0] + current.first;
                int j = it[1] + current.second;

                if(i<0 || i>=m || j<0 || j>=n || visited[i][j]==1 || arr[i][j]!=1){ /* if arr[i][j] other than 1  then do continue */
                    continue;
                }

                q.add(new Pair(i,j,time+1));
                visited[i][j] = 1;
                --uninfected;
            }
        }
        System.out.println("uninfected:- "+uninfected);
        if(uninfected!=0) return -1;

        return time;
    }
}
