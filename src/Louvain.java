import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Louvain {
    private Graph initialGraph;
    private Graph currentGraph;
    private Map<Integer, Integer> nodeToCommunity; // mapeia cada nó para sua comunidade
    private Map<Integer, List<Integer>> communityToNodes; // mapeia cada comunidade para seus nós
    private Map<Integer,Double> communityDegrees; // Soma graus dos nós de cada comunidade
    private double totalWeight; // soma dos graus de todos os nós (2*número de arestas)
    private double finalModularity;

//     constructor
    public Louvain(Graph graph){
        this.initialGraph = graph;
        this.currentGraph = graph; // o grafo vai ser 'condensado' durante o processo
        this.totalWeight = 2* graph.getNumEdges(); // para grafos não ponderados peso da aresta é 1
        initializeCommunities();
//        this.finalModularity
    }

    private void initializeCommunities(){
        nodeToCommunity = new HashMap<>();
        communityToNodes = new HashMap<>();
        communityDegrees = new HashMap<>();

        for (int i = 0; i < initialGraph.getNumNodes() ; i++) {
            nodeToCommunity.put(i,i); // cada nó é sua própria comunidade inicialmente
            List<Integer> nodes = new ArrayList<>();
            nodes.add(i);
            communityToNodes.put(i,nodes);
            communityDegrees.put(i,(double) initialGraph.getNeighbors(i).size()); // grau do nó
        }
    }
    /*
    Encontra as comunidades aplicando as duas fases do algoritmo de Louvain repetidamente
    @return Um map onde a key é o ID da comunidade e o value é uma list de npos nessa comunidade
     */
    public Map<Integer, List<Integer>> findCommunities(){
        boolean changed = true;
        while(changed){
            changed = false;
//            fase 1 - movimento de nós para otimizar a modularidade
//             colocar o 'changed' chamando uma função que movimenta os nós entre as comunidades para otimizar a modularidade
//            se nenhuma mudança ocorreu na fase 1, o algoritmo convergiu
            if ( !changed){
                break;
            }

//            fase 2 - construção de um novo grafo onde cada nó representa uma comunidade
            // currentGraph = agrega o grafo onde cada comunidade se torna um super-nó
            // reinitializeCommunitiesForAggregatedGraph -> reajustar as comunidades para um novo grafo
        }
//        return getFinalCommunities -> retorna o mapa final das comunidades;

    }

}
