import java.util.Scanner;

public class ComplexNetworkAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|  Analisador de Redes Complexas - Detecção de Comunidades (Louvain)  |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("| Instruções:                                                         |");
        System.out.println("| 1. Digite o número de nós no grafo.                                 |");
        System.out.println("| 2. Para cada nó, digite seus vizinhos (separados por espaço).       |");
        System.out.println("| Se um nó não tiver vizinhos, pressione Enter sem digitar nada.      |");
        System.out.println("| 3.O programa calculará as comunidades usando o algoritmo de Louvain |");
        System.out.println("-----------------------------------------------------------------------");

        int numNodes;
        while (true){
            try{
                System.out.print("Digite o número de nós (inteiro positivo): ");
                numNodes = Integer.parseInt(sc.nextLine());
                if (numNodes <=0){
                    System.out.println("O número de nós deve ser positivo. Tente novamente.");
                }else{
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }

        Graph graph = new Graph(numNodes);

        sc.close();

    }
}