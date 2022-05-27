package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortDFS {
    public void toposort(int v, ArrayList<ArrayList<Integer>> adj)
    {
        Stack<Integer> st= new Stack<>();
        int [] visited= new int[v+1];
        for(int i=1;i<=v;i++)
        {
            if(visited[i]==0)
            {
                dfstoposort(i,visited,adj,st);
            }
        }
        int [] topo = new int[v];
        int c=0;
        while (!st.isEmpty())
        {
            topo[c++]= st.pop();
        }
    }

    private void dfstoposort(int i, int[] visited, ArrayList<ArrayList<Integer>> adj,Stack<Integer> stack) {
        visited[i]=1;
        for(int k: adj.get(i))
        {
            if(visited[k]==0)
            {
                dfstoposort(k,visited,adj,stack);
            }
        }
        stack.add(i);
    }
}
