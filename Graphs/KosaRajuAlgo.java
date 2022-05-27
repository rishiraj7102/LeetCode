package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class KosaRajuAlgo {
    public void kosaraju(int v, ArrayList<ArrayList<Integer>> adj)
    {
        Stack<Integer> stack = new Stack<>();
        //step 1: toposort according to DFS
        int [] visited= new int[v];
        for(int i=0;i<v;i++)
        {
            if(visited[i]==0)
            {
                dfs(i,v,adj,stack, visited);
            }
        }

        // step 2:doing transpose of the graph ie. reversing the edges

        ArrayList<ArrayList<Integer>> transpose= new ArrayList<>();

        // initialize the arraylists in the transpose
        for(int i=0;i<v;i++)
        {
            transpose.add(new ArrayList<>());
        }
        for(int i=0;i<v;i++)
        {
            visited[i]=0;
            for(int node: adj.get(i))
            {
                transpose.get(node).add(i);
            }
        }

        // step3: dfs on transpose according to the topo sort stack order
        while (stack.size()>0)
        {
            int node=stack.peek();
            stack.pop();
           if(visited[node]==0)
           {
               revdfs(node,v,transpose,visited);
           }
        }
    }

    private void revdfs(int node, int v, ArrayList<ArrayList<Integer>> transpose, int[] visited) {
        visited[node]=1;
        System.out.print(node+" ");
        for(int i:transpose.get(node))
        {
            if(visited[i]==0)
            {
                revdfs(i,v,transpose,visited);
            }
        }
    }


    private void dfs(int i, int v, ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack, int [] visited) {
        visited[i]=1;
        for(int node : adj.get(i))
        {
            if(visited[node]==0)
            {
                dfs(node,v,adj,stack,visited);
            }
        }
        stack.add(i);
    }

}
