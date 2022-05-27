package Graphs;

import Strings.MergeAlternatively;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ShortestPathInWeightedDAG {
    public  int [] shortespath(int v, int source, ArrayList<ArrayList<Integer>> adj,int [][] weights)
    {
        int [] topo = toposort(v,adj);
        int [] distance = new int[v];
        distance[source]=0;
        for(int i=0;i<v;i++)
        {
            distance[i]=Integer.MAX_VALUE;
        }
        int index=0;
        while (index<topo.length)
        {
            for(int adjnodes:adj.get(topo[index]))
            {
                if(distance[index]!= Integer.MAX_VALUE)
                distance[adjnodes]=Math.min(distance[adjnodes],distance[topo[index]]+weights[index][adjnodes]);
            }
            index++;
        }
        return distance;
    }

    // below code copy pasted from topo sort prblm
    public int[] toposort(int v, ArrayList<ArrayList<Integer>> adj)
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
        return topo;
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
