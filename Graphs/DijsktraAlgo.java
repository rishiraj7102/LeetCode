package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijsktraAlgo {
    class Pair{
        int distance,node;
        Pair(int a,int b)
        {
            distance=a;node=b;
        }
    }
    public int [] dijsktraAlgo(int v, int source, ArrayList<ArrayList<Pair>> adj)
    {
        int [] distance= new int[v];
        for(int i=0;i<v;i++)
        {
            distance[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(0,source));
        distance[source]=0;
        while (!q.isEmpty())
        {
            int dis=q.peek().distance;
            int node= q.peek().node;
            q.poll();
            for(Pair adjnodes: adj.get(node))
            {
                distance[adjnodes.node]= Math.min(distance[adjnodes.node],dis+adjnodes.distance);
                q.add(new Pair(distance[adjnodes.node],adjnodes.node));
            }
        }
        return distance;
    }

}
