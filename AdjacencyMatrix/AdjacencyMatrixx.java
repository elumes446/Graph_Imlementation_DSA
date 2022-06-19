
public class AdjacencyMatrixx {

    public static void main(String[] args) {
       
     AdjacencyMatrix adj = new AdjacencyMatrix(4);
        adj.addEdge(0,1); // 0 as the array is 0-indexed
        adj.addEdge(1,2);
        adj.addEdge(2,3);
        adj.printGraph();
    }
    
}
