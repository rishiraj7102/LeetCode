package Graphs;

import java.util.ArrayList;

public class CycleDetectionInDirectedGraph {
    public boolean checkcycle(int v, ArrayList<ArrayList<Integer>> adj)
    {
        int [] visited = new int[v+1];
        int [] dfsvisited= new int[v+1];
        for(int i=1;i<=v;i++)
        {
            if(visited[i]==0)
            {
                if(dfscheck(i,visited,dfsvisited,adj))
                {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfscheck(int i, int[] visited, int[] dfsvisited, ArrayList<ArrayList<Integer>> adj) {
        visited[i]=1;
        dfsvisited[i]=1;
        for(int node:adj.get(i))
        {
            if(visited[node]==0)
            {
                if(dfscheck(node,visited,dfsvisited,adj))
                {
                    return true;
                }
                else  if(dfsvisited[node]==1)
                {
                    return true;
                }
            }
        }
        dfsvisited[i]=0;
        return false;
    }

}
