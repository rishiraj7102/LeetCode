package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteDFS {
    public boolean checkBipartite(int v, ArrayList<ArrayList<Integer>> adj)
    {
        int [] visited= new int[v+1];
        for(int i=1;i<=v;i++)
        {
            visited[i]=-1;
        }
        for(int i=1;i<=v;i++)
        {
            if(visited[i]==-1)
            {
                if(!dfscheck(i,v,adj,visited))
                {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfscheck(int i, int v, ArrayList<ArrayList<Integer>> adj, int [] visited) {
        if(visited[i]==-1)
        {
            visited[i]=1;
        }
        for(int k:adj.get(i))
        {
            if(visited[k]==-1)
            {
                visited[k]=1-visited[i];
                if(!dfscheck(k,v,adj,visited))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
