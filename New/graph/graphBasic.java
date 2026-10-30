import java.util.*;
pubic class graphBasic{
    static List<List<Integer>>graph = new ArrayLine<>();
    static void createGraph(int vertices){
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
    }
    static void addEdge(int u,int v){
        graph.get(u).add(v);
    }
}