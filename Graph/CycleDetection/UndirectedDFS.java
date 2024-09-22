package Graph.CycleDetection;
import java.util.*;
public class UndirectedDFS {

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
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(dfs(adj,i,visited,-1)) {
                    System.out.println("cycle present");
                    isCycle=true;
                }
            }
        }
        if(isCycle==false)
        System.out.println("cycle not present");
    }
    public static boolean dfs(List<List<Integer>>adj,int u,boolean visited[],int parent){
        visited[u]=true;

        for(int v:adj.get(u)){
            if(v==parent)continue;
            if(visited[v])return true;

            if(dfs(adj,v,visited,u))return true;
        }
        return false;
    }
}
