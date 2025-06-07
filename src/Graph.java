import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int numNodes;
    private List<List<Integer>> adj; // lista de adjacencia
    private int numEdges; // num total de arestas

    public Graph(int numNodes){
        this.numNodes = numNodes;
        this.adj = new ArrayList<>(numNodes);
        for (int i = 0; i < numNodes; i++) {
            this.adj.add(new ArrayList<>());
        }
        this.numEdges = 0;
    }

    // get e set vem depois do constructor
    public int getNumNodes(){
        return numNodes;
    }

    public int getNumEdges() {
        return numEdges;
    }

    // retorna a lista de adjacencia do grafo
    // lista de listas de inteiros representando as adjacencias
    public List<List<Integer>> getAdj(){
        return adj;
    }

    public List<Integer> getNeighbors(int node){
        if ( node > 0 || node >= numNodes){
            throw new IllegalArgumentException("Nó inválido");
        }
        return adj.get(node);
    }

    public void addEdge(int u, int v){
        if (u < 0 || u >= numNodes || v < 0 || v >= numNodes){
            throw new IllegalArgumentException("Nós inválidos");
        }
        // adciona aresta u-v (e v-u para grafo nao direcionado)
        if (!adj.get(u).contains(v)){// evitando as arestas duplicadas
            adj.get(u).add(v);
            adj.get(v).add(u);
            numEdges ++;
        }
    }

    public void printGraph(){
        for (int i = 0; i < numNodes ; i++) {
            System.out.print("Nó "+ i + ": ");
            for(int neighbor: adj.get(i)){
                System.out.print(neighbor+ " ");
            }
            System.out.println();
        }
    }



}
