package trees;
import models.Persona;
import nodes.Node;
public class Tree<T extends Comparable<T>>{
    private Node<T> root;
    public Tree(){
        this.root = null;
    }

    //metodo para insertar
    //metodo inOrder

    public void insert(T value){
        root = insertRecursive(root, value);
   }

   private Node<T> insertRecursive(Node<T> current, T value){
    if(current == null){
        return new Node<>(value);
    }
    if(value.compareTo(current.getValue()) < 0){
        current.setLeft(insertRecursive(current.getLeft(), value));
    }else if(value.compareTo(current.getValue()) > 0){
        current.setRight(insertRecursive(current.getRight(), value));
    }
    return current;
   }

    public void inOrder(){
    inOrderRecursive(root);
   }

   private void inOrderRecursive(Node<T> node){
        if(node == null){
            return;
        }
        inOrderRecursive(node.getLeft());
        System.out.println(node.getValue() + " ");
        inOrderRecursive(node.getRight());
    }

    public T searchByAge(T age){
        System.out.println("Searching for age: " + age);
        return searchByAgeRecursive(root, age);
    }

    private T searchByAgeRecursive(Node<T> current, int age){
        if(current == null){
            return;
        }
        Persona persona = (Persona) current.getValue();
        if(persona.getAge() == age){
            System.out.println(persona);
        }
        if(persona.getAge() > age){
            searchByAgeRecursive(current.getLeft(), age);
        }
        else{
            searchByAgeRecursive(current.getRight(), age);
        }
       
    }
}
