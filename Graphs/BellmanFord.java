package Graphs;

import java.util.ArrayList;

public class BellmanFord {
    class Node{
        int u,v,weight;
        Node(int x,int y,int w)
        {
            u=x;
            v=y;
            weight=w;
        }
    }
    public void bellmanfordalgo(int v, ArrayList<Node> adj)
    {
        int [] dist =  new int[v];
        dist[0]=0;
        for(int i=0;i<v;i++)
        {
            for(Node node:adj)
            {
                if (dist[node.u]+node.weight<dist[node.v])
                {
                    dist[node.v]=dist[node.u]+node.weight;
                }
            }
        }
        int fl=0;
        for(Node node:adj)
        {
            if (dist[node.u]+node.weight<dist[node.v])
            {
                fl=1;
                System.out.println("negative cycle");
            }
        }
    }
}
