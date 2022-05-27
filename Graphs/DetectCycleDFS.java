package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleDFS {
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
    public boolean isCycle(int i, int parent, ArrayList<ArrayList<Integer>> adjacency_list,int [] visited)
    {
        visited[i]=1;
        for(int node:adjacency_list.get(i))
        {
            if(visited[node]==0)
            {
                if(isCycle(node,i,adjacency_list,visited))
                    return true;
            }
            else if(parent!=node)
            {
                return true;
            }
        }
        return false;
    }
    public boolean cycleChecker(int v, ArrayList<ArrayList<Integer>> adjacency_list)
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
