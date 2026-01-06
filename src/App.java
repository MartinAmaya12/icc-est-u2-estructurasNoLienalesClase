import models.Persona;
import trees.IntTree;
import trees.Tree;
public class App {
    public static void main(String[] args) throws Exception {
        //runIntTree();
        runTree();
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
    
}
