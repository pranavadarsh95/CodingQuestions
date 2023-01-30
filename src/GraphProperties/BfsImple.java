package GraphProperties;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Note:- we assume index starts from 0
public class BfsImple {
    static int v = 5;
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(v);

        createGraph(adjList);
        printAdjList(adjList);

        ArrayList<Integer> bfsResult = bfsTra(adjList);

        System.out.println("Printing bfs traversal result");
        for (int i : bfsResult){
            System.out.print(i+" ");
        }
    }

    private static ArrayList<Integer> bfsTra(ArrayList<ArrayList<Integer>> adjList) {
        int visited[] = new int[v];

        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        // adding source node

        q.add(0);
        visited[0] = 1;

        while(!q.isEmpty()){
            int current = q.poll();
            result.add(current);

            for(int i:adjList.get(current)){
                if(visited[i]!=1) {
                    visited[i] = 1;
                    q.add(i);
                }
            }

        }
        return result;
    }

    private static void printAdjList(ArrayList<ArrayList<Integer>> adjList) {
        for(int i=0; i<adjList.size(); i++){
            System.out.print(i+" has =>"+" ");
            for(int j=0; j< adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    private static void createGraph(ArrayList<ArrayList<Integer>> adjList) {
        int edges[][] = {{0,4},{0,1},{0,2},{1,2},{4,3},{3,2}};

        for(int i=0; i<v; i++){
            adjList.add(new ArrayList<>());
        }

        for(int ed[] : edges){
            adjList.get(ed[0]).add(ed[1]);
            adjList.get(ed[1]).add(ed[0]);
        }

    }
}
