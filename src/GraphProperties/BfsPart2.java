package GraphProperties;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsPart2 {
    int v;
    ArrayList<ArrayList<Integer>> adjList;

    BfsPart2(int v) {
        this.v = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(i, new ArrayList<>());
        }
    }

    void addEdges(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public static void main(String[] args) {
        BfsPart2 bfsPart2 = new BfsPart2(5);

        bfsPart2.addEdges(0, 1);
        bfsPart2.addEdges(0, 3);
        bfsPart2.addEdges(1, 2);
        bfsPart2.addEdges(2, 3);
        bfsPart2.addEdges(2, 4);

        bfsPart2.bfsTraversal(0);
    }

    private void bfsTraversal(int sourceVertex) {
        boolean visited[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(sourceVertex);
        visited[sourceVertex] = true;

        while (!q.isEmpty()) {

            int curr = q.poll();
            System.out.print(curr + " ");
            for (int i : adjList.get(curr)) {
                if (visited[i] != true) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
