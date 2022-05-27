//package Graphs;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class BFS {
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> adjacency_list=new ArrayList<>();
//        int no_of_nodes=7;
//        ArrayList<Integer> temp=new ArrayList<>();
//        temp.add(2);
//        adjacency_list.add(1,temp );
//        temp.clear();
//        temp.add(2);
//        temp.add(3);
//        temp.add()
//        adjacency_list.add(2,new int[]{1,3,7});
//        adjacency_list.add(3,new int[]{6,5});
//        adjacency_list.add(4,new int[]{6});
//        adjacency_list.add(5,new int[]{3,7});
//        adjacency_list.add(6,new int[]{4});
//        adjacency_list.add(7,new int[]{2,5});
//
//        System.out.println(bfsTraversal(no_of_nodes,adjacency_list));
//    }
//    public static ArrayList<Integer> bfsTraversal(int v,ArrayList<ArrayList<int []>> adj)
//    {
//        ArrayList<Integer> ans=new ArrayList<>();
//        int [] visited=new int[v+1];
//        for(int i=1;i<=v;i++)
//        {
//            if(visited[i]==0)
//            {
//                Queue<Integer> q=new LinkedList();
//                q.add(i);
//                visited[i]=1;
//
//                while (!q.isEmpty())
//                {
//                    int node=q.poll();
//                    ans.add(node);
//
//                    for(int k:adj.get(node))
//                    {
//                        if(visited[k]==0)
//                        {
//                            q.add(k);
//                            visited[k]=1;
//                        }
//                    }
//                }
//            }
//
//        }
//        return ans;
//    }
//}
