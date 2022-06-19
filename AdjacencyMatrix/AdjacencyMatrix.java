
public class AdjacencyMatrix {
    
    int vertex;
    int[][] matrix;

   
    public AdjacencyMatrix(int vertex){
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int start,int destination){
        matrix[start][destination] = 1;
        matrix[destination][start] = 1;
    }

    public void printGraph(){
        System.out.println("Adjacency Matrix : ");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j <vertex ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

}

