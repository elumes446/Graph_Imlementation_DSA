

import java.io.*;
import java.util.*;
 
public class DFS {
   
    private int V; 
    private LinkedList<Integer> adj[];
    @SuppressWarnings("unchecked") DFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w); // Add w to v's list.
    }
    void DFSUtil(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
 

    void DFSS(int v)
    {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
}
    

