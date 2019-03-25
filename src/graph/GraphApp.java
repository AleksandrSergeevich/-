package graph;

public class GraphApp {
    public static void main(String[] args) {
        Graph gr = new Graph();
        gr.addV('A');
        gr.addV('B');
        gr.addV('C');
        gr.addV('D');
        gr.addV('E');
        gr.addV('F');
        gr.addV('G');
        gr.addV('H');
        gr.addV('I');
        gr.addV('J');


        gr.addEdge(0,1); // A -> B
        gr.addEdge(1,2); // B -> C
        gr.addEdge(2,3); // A -> D
        gr.addEdge(4,3); // D -> E
        gr.addEdge(4,5); // E -> F
        gr.addEdge(5,6); // F -> G
        gr.addEdge(6,7); // G -> H
        gr.addEdge(7,8); // H -> I
        gr.addEdge(9,8); // J -> I
        gr.addEdge(8,9); // I -> J

        gr.bfs();

    }
}
