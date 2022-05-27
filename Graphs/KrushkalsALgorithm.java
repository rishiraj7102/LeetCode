package Graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

public class KrushkalsALgorithm {
    class WeightedEdges implements Comparator <WeightedEdges>{
        int weight;
        int from;
        int to;
        WeightedEdges(int w,int f, int t)
        {
            weight=w;
            from=f;
            to=t;
        }

        @Override
        public int compare(WeightedEdges o1, WeightedEdges o2) {
            if(o1.weight>o2.weight)
                return 1;
            if(o1.weight<o2.weight)
                return -1;
            else return 0;
        }

    }
    class Edge{
        int from;
        int to;
        Edge(int f,int t)
        {
            from=f;
            to=t;
        }
    }
    public int findParent(int node,int [] parent)
    {
        if(node==parent[node])
        {
            return node;
        }
        return parent[node]=findParent(parent[node],parent);
    }
    public void union_ds(int u, int v, int [] parent, int [] rank)
    {
        u=findParent(u,parent);
        v=findParent(v,parent);
        if(rank[u]<rank[v])
        {
            parent[u]=v;
        }
        else  if(rank[u]>rank[v])
        {
            parent[v]=u;
        }
        else {
           parent[v]=u;
            rank[u]++;
        }
    }
    public void mainfun(int v, PriorityQueue<WeightedEdges> pq)
    {
        int [] rank = new int[v+1];
        int [] parent= new int[v+1];
        ArrayList<Edge> edges= new ArrayList<>();
        for(int i=1;i<=v;i++)
        {
            rank[i]=0;
            parent[i]=i;
        }
        int cost=0;
        for(WeightedEdges edge: pq)
        {
            int weight= edge.weight;
            int from=edge.from;
            int to= edge.to;
            int parent1=findParent(from,parent);
            int parent2=findParent(to,parent);
            if(parent1!=parent2)
            {
                cost+=weight;
                edges.add(new Edge(from,to));
                union_ds(from,to,parent,rank);
            }

        }
    }
}
