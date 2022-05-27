package Graphs;

import java.util.ArrayList;


public class DisjointSet {
    class ParentRank{
        int parent;
        int rank;
        ParentRank(int p,int r)
        {
            parent=p;
            rank=r;
        }
    }
    class Nodes{
        int from, to;
        Nodes(int from,int to)
        {
            this.from=from;
            this.to=to;
        }
    }
    public int findParent(int node)
    {
        if(node==dsuv.get(node).parent)
        {
            return node;
        }
        return dsuv.get(node).parent=findParent((dsuv.get(node).parent));
    }
    public void union_ds(int u, int v)
    {
        u=findParent(u);
        v=findParent(v);
        if(dsuv.get(u).rank<dsuv.get(v).rank)
        {
            dsuv.get(u).parent=v;
        }
        else if(dsuv.get(u).rank>dsuv.get(v).rank)
        {
            dsuv.get(v).parent=u;

        }
        else {
            dsuv.get(v).parent=u;
            dsuv.get(u).rank++;
        }
    }
    ArrayList<ParentRank> dsuv = new ArrayList<>();
    public void makeset(int v , ArrayList<Nodes> edge_list)
    {
        for(int i=1;i<=v;i++)
        {
            dsuv.get(i).parent=i;
            dsuv.get(i).rank=0;
        }

    }

}
