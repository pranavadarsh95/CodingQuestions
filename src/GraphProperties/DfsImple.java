package GraphProperties;

import java.util.ArrayList;


class Graph {
    int v;
    ArrayList<ArrayList<Integer>> adjList;

    Graph(){

    }

    public Graph(int v){
        this.v = v;
        adjList = new ArrayList<>();

        for(int i=0;i<v;i++){
            adjList.add(i,new ArrayList<>());
        }
    }

    public void dfsTra(int sourceVertex) {

        boolean visited[] = new boolean[v];

        ArrayList<Integer> dfsResult = new ArrayList<>();

        dfsTraUtil(sourceVertex, visited, dfsResult);

        System.out.println("Printing dfs traversal result");
        for (int i : dfsResult){
            System.out.print(i+" ");
        }
    }

    private void dfsTraUtil(int sourceVertex, boolean[] visited, ArrayList<Integer> dfsResult ) {

        visited[sourceVertex] = true;
        dfsResult.add(sourceVertex);

        for(int i : adjList.get(sourceVertex)){
            if(visited[i]==false){
                dfsTraUtil(i, visited, dfsResult);
            }
        }
    }

    public void addEdges(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
}


// Note:- we assume index starts from 0
public class DfsImple {
    static int v = 5;
    public static void main(String[] args) {

       Graph graph = new Graph(v);
        graph.addEdges(0,1);
        graph.addEdges(0,3);
        graph.addEdges(1,2);
        graph.addEdges(2,4);
        graph.addEdges(2,3);

        System.out.println("Print Adjacency list");
        printAdjList(graph.adjList);

        graph.dfsTra(0);

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
}
