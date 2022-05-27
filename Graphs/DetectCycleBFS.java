package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleBFS {
    public static void main(String[] args) {

    }
    class Pair{
        int x;
        int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public boolean isCycle(int i, int v, ArrayList<ArrayList<Integer>> adjacency_list, int [] visited)
    {
        Queue<Pair> q=new LinkedList<>();
        visited[i]=1;
        q.add(new Pair(i,-1));
        while (!q.isEmpty())
        {
            int node=q.peek().x;
            int prev=q.peek().y;
            q.poll();
            for(int nodes:adjacency_list.get(i))
            {
                if(visited[nodes]==0)
                {
                    q.add(new Pair(nodes,node));
                    visited[nodes]=1;
                }
                else if(nodes!=prev){
                return true;
                }
            }
        }
        return false;
    }
    public boolean cycleChecker(int v,ArrayList<ArrayList<Integer>> adjacency_list)
    {
        int [] visited= new int[v+1];
        for(int i=1;i<=v;i++)
        {
            if(visited[i]==0)
            {
                if(isCycle(i,v,adjacency_list,visited))
                    return true;
            }
        }
        return false;
    }
}
