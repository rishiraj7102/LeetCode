package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalBFS {
    public void toposort(int v, ArrayList<ArrayList<Integer>> adj)
    {
        //first we calculate the indegree ie the number of edges coming in for each node
        int [] indegree = new int[v+1];
        for(int i=1;i<=v;i++)
        {

            for(int k: adj.get(i))
            {
                indegree[k]++;
            }
        }
        // now firstly adding all the nodes with indegree 0 as no edge comes in
        //hence they will always be u in u->v

        Queue <Integer> q= new LinkedList<>();
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }

        // now for each node in the q we keep on reducing the indegree by 1 for each adjacent node of the nodes in q
        // when a indegree becomes 0 add them to q

        int ind=0;
        while (!q.isEmpty())
        {
            int node= q.poll();
            for(int k: adj.get(node))
            {
                indegree[k]--;
                if(indegree[k]==0)
                {
                    q.add(k);
                }
            }
        }
        int [] toposort= new int[v];
        while (!q.isEmpty())
        {
            toposort[ind++]=q.poll();
        }
    }
}
