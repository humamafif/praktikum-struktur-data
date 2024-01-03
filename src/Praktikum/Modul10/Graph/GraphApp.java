package Praktikum.Modul10.Graph;

public class GraphApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); //0
        theGraph.addVertex('B'); //1
        theGraph.addVertex('C'); //2
        theGraph.addVertex('D'); //3
        theGraph.addVertex('E'); //4

        theGraph.addEdgeUndirected(0, 1); //AB
        theGraph.addEdgeUndirected(1, 2); //BC
        theGraph.addEdgeUndirected(0, 3); //CD
        theGraph.addEdgeUndirected(3, 4); //DE
        System.out.println("Nomer 5 (Undirected)");
        theGraph.display();
        theGraph.dfsConnectivityTable();

        System.out.println(">>  Depth First Search  <<");
        theGraph.dfs();

        System.out.println(">>  Breadth First Search  <<");
        theGraph.bfs();

        System.out.println(">>  Minimum Spanning Tree  <<");
        theGraph.mst();

        System.out.println("Praktikum : ");
        System.out.println("1. (Directed)");
        theGraph.addEdgeDirected(0, 2); //Ac
        theGraph.addEdgeDirected(1, 0); //BA
        theGraph.addEdgeDirected(1, 4); //be
        theGraph.addEdgeDirected(4, 2); //ec
        theGraph.addEdgeDirected(3, 4); //de
        theGraph.display();
        System.out.println("2. (Connectivity Table)");
        theGraph.dfsConnectivityTable();

        System.out.println("\n3. (Topological Graph)");

        Graph theGraphh = new Graph();
        theGraphh.addVertex('A'); //0
        theGraphh.addVertex('B'); //1
        theGraphh.addVertex('C'); //2
        theGraphh.addVertex('D'); //3
        theGraphh.addVertex('E'); //4
        theGraphh.addVertex('F'); //5
        theGraphh.addVertex('G'); //6
        theGraphh.addVertex('H'); //7

        theGraphh.addEdgeDirected(0, 3); //ad
        theGraphh.addEdgeDirected(0, 4); //ae
        theGraphh.addEdgeDirected(1, 4); //be
        theGraphh.addEdgeDirected(3, 6); //dg
        theGraphh.addEdgeDirected(4, 6); //eg
        theGraphh.addEdgeDirected(6, 7); //gh
        theGraphh.addEdgeDirected(2, 5); //cf
        theGraphh.addEdgeDirected(5, 7); //cf

        theGraphh.topo();
    }
}
