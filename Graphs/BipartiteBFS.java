package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BipartiteBFS {
    public boolean isBipartite(int[][] graph) {
        int v=graph.length;
        int [] visited= new int[v];
        for(int i=0;i<v;i++)
        {
            visited[i]=-1;
        }
        for(int i=0;i<v;i++)
        {
            if(visited[i]==-1)
            {
                if(!bfscheck(i,visited,graph))
                {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean bfscheck(int i, int[] visited, int[][] graph) {

        int v= graph.length;
        Queue <Integer> q= new LinkedList<>();
        q.add(i);
        visited[i]=0;
        while (!q.isEmpty())
        {
            int node=q.poll();
            for(int k: graph[node])
            {
                if(visited[k]==-1)
                {
                    q.add(k);
                    visited[k]=1-visited[node];
                }
                else if(visited[k]==visited[node])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
