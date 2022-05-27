package Graphs;

import java.util.ArrayList;

public class BridgesinGraphs {
    public void findbridges(int v, ArrayList<ArrayList<Integer>> adj)
    {
        int [] vis = new int[v];
        int [] tin = new int[v];
        int [] low = new int[v];
        int timer=0;
        for(int i=0;i<v;i++)
        {
            if(vis[i]==0)
            {
                dfs(i,-1,vis,tin,low,adj, timer);
            }
        }

    }

    private void dfs(int i, int parent, int[] vis, int[] tin, int[] low, ArrayList<ArrayList<Integer>> adj,int timer) {
        vis[i]=1;
        tin[i]=low[i]=timer++;
        for(int nodes: adj.get(i))
        {
            if(nodes==parent)
            {
                continue;
            }
            if(vis[nodes]==0)
            {
                dfs(nodes,i,vis,tin,low,adj,timer);
                low[i]=Math.min(low[i],low[nodes]);

                if(low[nodes]>tin[i])
                {
                    System.out.println(i+" "+ nodes); //bridge found
                }
            }
            else {
                low[i]=Math.min(low[i],tin[nodes]);
            }
        }
    }

}
