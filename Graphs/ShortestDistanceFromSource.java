package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ShortestDistanceFromSource {
    public int [] shortestD(int v, ArrayList<ArrayList<Integer>> adj, int source)
    {
        Queue<Integer> q= new LinkedList<>();
        int [] distance= new int[v];
        //initialising all values to max as we will later do the minimum
        for(int i=0;i<v;i++)
        {
            distance[i]=Integer.MAX_VALUE;
        }
        // dist from source to itself will be 0
        distance[source]=0;
        q.add(source);
        while (!q.isEmpty())
        {
            int node= q.poll();
            for(int adjnodes: adj.get(node))
            {
                int dis=distance[node]+1;
                distance[adjnodes]= Math.min(distance[adjnodes],dis);
                q.add(adjnodes);
            }
        }
        return distance;
    }
}
