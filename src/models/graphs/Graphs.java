package models.graphs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import nodes.Node;

public class Graphs<T> {

    // 1- primera forma
    List<Node<T>> nodes;

    //2da forma
    private Map<Node<T>, List<Node<T>>> mapas;

    public Graphs() {
        this.mapas = new LinkedHashMap<Node<T>, List<Node<T>>>();
    }

    public void insertNode(T value){
        Node<T> newNode = new Node<T>(value);
        this.nodes.add(newNode);
    }

    public void addNode(Node<T> node){
        mapas.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(Node<T> node1, Node<T> node2){
        addNode(node1);
        addNode(node2);
        mapas.get(node1).add(node2);
        mapas.get(node2).add(node1);
    }
    public void addConocido(Node<T> node1, Node<T> node2){
        addNode(node1);
        addNode(node2);
        mapas.get(node1).add(node2);
        //Del mapa obtengo el listado
        //get(node1) -> Listado N1
        //ad(node2) -> agrego N2 al listado N1
    }

    public void removeNode(Node<T> node){
        mapas.remove(node);
    }

    public void printGraph(){
        for (Map.Entry<Node<T>, List<Node<T>>> entry : mapas.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for(Node<T> neighbor : entry.getValue()){
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public List<Node<T>> getNeighbors(Node<T> node){
        return mapas.get(node);
    }

    public void bfs(Node<T> start){
        Set<Node<T>> visitados = new java.util.HashSet<>();
        Queue<Node<T>> queue = new LinkedList<>();

        visitados.add(start);
        queue.add(start);

        while(!queue.isEmpty()){
            Node<T> current = queue.poll();
            System.out.print(current.getValue() + " ");

            for(Node<T> conocido : getNeighbors(current)){
                if(!visitados.contains(conocido)){
                    visitados.add(conocido);
                    queue.add(conocido);
                }
            }
        }
    }

    public void dfs(Node<T> start){
        Set<Node<T>> visitados = new java.util.HashSet<>();
        dfsRecursive(start, visitados);
    }

    public void dfsRecursive(Node<T> current, Set<Node<T>> visitados){
        //cu -> 23 | vi ->()
        visitados.add(current); //vi -> (23)
        System.out.print(current.getValue() + " ");
        //Carlos 23 - luis 18

        for(Node<T> conocido : getNeighbors(current)){
            if(!visitados.contains(conocido)){ // vi -> (23)
                dfsRecursive(conocido, visitados);
            }
        }
    }

    
}