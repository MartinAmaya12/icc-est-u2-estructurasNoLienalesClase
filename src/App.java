import models.Persona;
import nodes.Node;
import trees.IntTree;
import trees.Tree;
import models.graphs.Graphs;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runTree();
        runGraph();
    }
    private static void runTree(){
        Tree<Persona> tree = new Tree<Persona>();
        tree.insert(new Persona("Pablo", 21));
        tree.insert(new Persona("Maria", 23));
        tree.insert(new Persona("Ana", 25));
        tree.insert(new Persona("Pedro", 23));
        tree.insert(new Persona("Luis", 19)); 
        System.out.println("In Order: ");
        tree.inOrder();
        Persona encontrada = tree.searchByAge(23);
        if (encontrada != null) {
            System.out.println("\nPersona encontrada: " + encontrada);
        } else {
            System.out.println("\nPersona no encontrada con esa edad.");
        }
    }
    private static void runIntTree(){
        IntTree tree= new IntTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(15);
        System.out.println("Pre Order: ");
        tree.preOrder();
        System.out.println("Pos Order: ");
        tree.posOrder();
        System.out.println("In Order");
        tree.inOrder();
        System.out.println("Size: " + tree.size());
    }

     public static void runGraph(){
        Graphs<String> graph = new Graphs<String>();

        Node<String> node1 = new Node<String>("A");
        Node<String> node2 = new Node<String>("B");
        Node<String> node3 = new Node<String>("C");
        Node<String> node4 = new Node<String>("D");

        graph.addNode(node1);
        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node2, node4);
        graph.addEdge(node3, node4);

        graph.printGraph();

        List<Node<String>> neighbors = graph.getNeighbors(node1);   
        System.out.print("Neighbors de A: ");
        for(Node<String> neighbor : neighbors){
            System.out.print(neighbor + " ");
        }
        System.out.println();
    }
    

    public static void runGraphRecorridos(){
        Graphs<Persona> graph = new Graphs<Persona>();
        Persona pC23 = new Persona("Carlos", 23);
        Persona pL18 = new Persona("Luis", 18);
        Persona pA23 = new Persona("Alan", 23);
        Persona pA30 = new Persona("Alan", 30);
        Persona pJ25 = new Persona("Juan", 25);
        Persona pA20 = new Persona("Ana", 20);

        graph.addEdge(new Node<>(pC23), new Node<>(pL18));
        graph.addEdge(new Node<>(pC23), new Node(pA23));
        graph.addEdge(new Node<>(pL18), new Node<>(pA30));
        graph.addEdge(new Node<>(pA23), new Node<>(pJ25));
        
        graph.addConocido(new Node<>(pJ25), new Node<>(pA20));
        graph.addConocido(new Node<>(pA20), new Node<>(pA30));
        

    }
}
