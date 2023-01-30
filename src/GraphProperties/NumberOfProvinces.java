package GraphProperties;

public class NumberOfProvinces extends Graph{

    NumberOfProvinces(int v){
        super(v);
    }

    public static void main(String[] args) {

        NumberOfProvinces numberOfProvinces = new NumberOfProvinces(6);
        numberOfProvinces.addEdges(0,1);
        numberOfProvinces.addEdges(1,2);
        numberOfProvinces.addEdges(4,5);

        int count = numberOfProvinces.noOfProvinces(0);
        System.out.println("No of Proviences "+count);
    }

    private int noOfProvinces(int i) {
        int count =0;
        boolean visited[] = new boolean[v];
        for(i=0; i<v; i++){
            if(visited[i]==false) {
                dfsTraversal(visited, i);
                count++;
            }
        }
        return count;
    }

    private void dfsTraversal(boolean visited[], int sourceVertex) {

        for(int i: adjList.get(sourceVertex)){
            if(visited[i]==false)
            {
               visited[i] = true;
               dfsTraversal(visited, i);
            }
        }

    }
}


