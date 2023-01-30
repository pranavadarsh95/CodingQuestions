package GraphProperties;

import java.util.ArrayList;
import java.util.Scanner;

// Note:- we assume index starts from 0
public class GraphImple {

   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // No of vertices
        System.out.println("Enter no of Vertices");
        int v = sc.nextInt();
        // No of edges
        System.out.println("Enter no of Edges");
        int e = sc.nextInt();

        int adjMat[][] = new int[v+1][v+1];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(v);

        // complexity v*v
//
//        printAdjMat(adjMat, v);

        // complexity v*e
        adjListFun(adjList,v,e);
        printAdjList(adjList);
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

    private static void adjListFun(ArrayList<ArrayList<Integer>> adjList, int v, int e) {
        for(int i=1; i<=v; i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=1; i<=e; i++) {
            System.out.println("Enter edge1 ");
            int e1 = sc.nextInt();
            System.out.println("Enter edge2 ");
            int e2 = sc.nextInt();

            adjList.get(e1).add(e2);
            adjList.get(e2).add(e1);
        }


    }

    private static void adjMatFun(int adjMat[][], int e) {
        for(int i=1; i<=e; i++){
            System.out.println("Enter edge1 ");
            int e1 = sc.nextInt();
            System.out.println("Enter edge2 ");
            int e2 = sc.nextInt();

            adjMat[e1][e2] = 1; // assiging 1 as weight to the edge
            adjMat[e2][e1] = 1; // assiging 1 as weight to the edge
        }
    }

    private static void printAdjMat(int[][] adjMat, int v) {
        for(int i=1; i < v+1; i++){
            for(int j=1; j < v+1; j++){
                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
