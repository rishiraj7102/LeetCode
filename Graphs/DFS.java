package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> dfs(int v,ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int [] visited=new int[v+1];
        for(int i=1;i<=v;i++)
        {
            if(visited[i]==0)
            {
                dfsofGraph(i,visited,adj,ans);
            }
        }
        return ans;
    }

    private void dfsofGraph(int i, int[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
        ans.add(i);
        visited[i]=1;
        for(Integer k: adj.get(i))
        {
            if(visited[k]==0)
            {
                dfsofGraph(k,visited,adj,ans);
            }
        }

    }
}
