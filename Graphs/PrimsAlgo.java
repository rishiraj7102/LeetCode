package Graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PrimsAlgo {
    class Node{
        int v, weight;
        Node(int x,int y)
        {
            v=x;
            weight=y;
        }
    }
    //brute force implementation for prims algo
    public void primsalgo(int v, ArrayList<ArrayList<Node>> adj)
    {
        int [] keys= new int[v];
        boolean [] mst = new boolean[v];
        int [] parent = new int[v];
        for(int i=0;i<v;i++)
        {
            keys[i]=Integer.MAX_VALUE;
            mst[i]=false;
            parent[i]=-1;
        }
        for(int i=0;i<v-1;i++)
        {
            int min=Integer.MAX_VALUE, u=0;
            for(int k=0;k<v;k++)
            {
                if(mst[k]==false && keys[k]<min)
                {
                    min=keys[k];
                    u=k;
                }
            }
            mst[u]=true;

            for(Node it: adj.get(u))
            {
                if(mst[it.v]==false && it.weight<keys[it.v])
                {
                    keys[it.v]=it.weight;
                    parent[it.v]=u;
                }
            }
        }
    }
    class Node2 implements Comparator<Node2>{
        int v, weight;
        Node2(int x,int y)
        {
            v=x;
            weight=y;
        }

        @Override
        public int compare(Node2 o1, Node2 o2) {
            if(o1.weight< o2.weight)
            {
                return -1;
            }
            if(o1.weight > o2.weight)
                return 1;
            return 0;
        }

    }
    //optimised using priority queue
    public void primsalgoOptimised(int v, ArrayList<ArrayList<Node2>> adj)
    {
        int [] keys= new int[v];
        boolean [] mst = new boolean[v];
        int [] parent = new int[v];
        for(int i=0;i<v;i++)
        {
            keys[i]=Integer.MAX_VALUE;
            mst[i]=false;
            parent[i]=-1;
        }
        PriorityQueue<Node2> pq=new PriorityQueue<>();

        for(int i=0;i<v-1;i++)
        {
//            int min=Integer.MAX_VALUE, u=0;
//            for(int k=0;k<v;k++)
//            {
//                if(mst[k]==false && keys[k]<min)
//                {
//                    min=keys[k];
//                    u=k;
//                }
//            }
            int u=pq.poll().v;
            mst[u]=true;

            for(Node2 it: adj.get(u))
            {
                if(!mst[it.v] && it.weight<keys[it.v])
                {
                    keys[it.v]=it.weight;
                    parent[it.v]=u;
                }
            }
        }
    }

}
