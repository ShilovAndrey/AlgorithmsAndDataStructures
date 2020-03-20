package dataStructures.graph.walkin_Depth;

import java.util.Stack;

public class Graph {
    private final int NUM_OF_VERTEX = 20;
    private Vertex[] vertexArray;
    private int nVertex;
    private int[][] neighbors;
    private Stack<Integer> theStack;

    public Graph() {
        vertexArray = new Vertex[NUM_OF_VERTEX];
        nVertex = 0;
        theStack = new Stack();
        neighbors = new int[NUM_OF_VERTEX][NUM_OF_VERTEX];

        for (int i = 0; i < nVertex; i++) {
            for (int j = 0; j < nVertex; j++)
                neighbors[i][j] = 0;
        }
    }

    public void displayVertex(int i) {
        System.out.println(vertexArray[i].letter);
    }

    public void addVertex(char el) {
        vertexArray[nVertex++] = new Vertex(el);
    }

    public void addEdge(int start,int finish){
        neighbors[start][finish]=1;
        neighbors[finish][start]=1;
    }

    public void walkInDepth() {
        vertexArray[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);

        while (!theStack.empty()) {
            int v = findUnvisitedNeighbors(theStack.peek());
            if (v == -1)
                theStack.pop();
            else{
                vertexArray[v].wasVisited=true;
                displayVertex(v);
                theStack.push(v);
            }
        }

        for (int i = 0; i < nVertex; i++)
            vertexArray[i].wasVisited = false;
    }

    private int findUnvisitedNeighbors(int v) {
        for (int i = 0; i < nVertex; i++) {
            if (vertexArray[i].wasVisited == false && neighbors[v][i] == 1)
                return i;
        }
        return -1;
    }
}
