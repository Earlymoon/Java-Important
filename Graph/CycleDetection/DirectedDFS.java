package Graph.CycleDetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DirectedDFS {
    public static void main(String[] args) {
        int graph[][]=  {{1},{2},{}};
        int n=3;
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
        boolean rec[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(dfs(adj,i,visited,rec)) {
                    System.out.println("cycle present");
                    isCycle=true;
                }
            }
        }
        if(isCycle==false)
            System.out.println("cycle not present");
    }
    public static boolean dfs(List<List<Integer>>adj,int u,boolean visited[],boolean rec[]){

        visited[u]=true;
        rec[u]=true;
        for(int v:adj.get(u)){
            if(visited[v]&&rec[v])return true;
            if(dfs(adj,v,visited,rec))return true;
        }
        rec[u]=false;
        return false;
    }
}
