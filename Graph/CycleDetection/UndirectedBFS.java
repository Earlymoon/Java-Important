package Graph.CycleDetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
public class UndirectedBFS {
    static class Pair{
        int u;
        int parent;
        Pair(int a,int b){
            this.u=a;
            this.parent=b;
        }
    }
    public static void main(String[] args) {
        int graph[][]=  {{}, {2}, {1, 3}, {2}};
        int n=4;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int num:graph[i]){
                adj.get(i).add(num);
            }
        }
        boolean isCycle=false;
        boolean visited[]=new boolean[n];
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(!visited[i]){
                q.add(new Pair(i,-1));
                visited[i]=true;
                if(bfs(adj,i,visited,q)) {
                    System.out.println("cycle present");
                    isCycle=true;
                }
            }
        }
        if(isCycle==false)
            System.out.println("cycle not present");
    }
    public static boolean bfs(List<List<Integer>>adj,int u,boolean visited[],Queue<Pair>q){
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int u_= curr.u;
            int parent_=curr.parent;

            for(int num:adj.get(u_)){
                if(num==parent_)continue;
                if(visited[num])return true;
                visited[num]=true;
                q.add(new Pair(num,u_));
            }
        }
        return false;
    }
}
