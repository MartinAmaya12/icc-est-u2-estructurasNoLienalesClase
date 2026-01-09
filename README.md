# Práctica: Estructuras No Lineales - 

## Autor
- Nombre: Renato Martin Amaya Siguenza
- Carrera/Curso: Estructura de Datos


##  Nombre de la práctica - Fecha
- Práctica: Practica de Arboles-Implementacion de Integers
- Fecha: 05/01/2026

## Descripción
Objetivo. Implementar un Árbol Binario de Búsqueda para enteros con recorridos PreOrder, InOrder, PostOrder y un método size() que retorne el total de nodos en complejidad O(1).

Entregable. Repositorio con:

Código fuente actualizado.

Evidencias en la carpeta assets/ (o equivalente).

README de la práctica actualizado.

Requisitos

El árbol debe permitir inserción de enteros.

Debe imprimir en consola los tres recorridos:

PreOrder

InOrder

PostOrder

Debe imprimir en consola el tamaño del árbol.

size() debe ser O(1). Para cumplirlo, el árbol debe mantener un contador interno (ej. private int size;) que se actualice en insert (y en delete si existiera).

## Evidencias
### Captura 1
Evidencia Muestra de monitor
![alt text](assets/Evidencia1.png)


### Captura 2 
Evidencia metodo inOrder
![alt text](assets/Evidencia2.png)


## Práctica de Árboles – Implementación Genéricos uso de interfaces Comparable
### Objetivo
Implementar un Árbol Binario de Búsqueda genérico en Java usando:

Node<T>
Tree<T>
Object implements Comparable<Object>
El criterio de ordenamiento no se impone en la clase Tree, sino en los objetos almacenados, cuando estos implementan la interfaz Comparable.

### Requisitos técnicos
Implementar la clase genérica:

class Tree<T>
Implementar la clase:

class Node<T>
El árbol debe permitir inserción de elementos de tipo T.

El ordenamiento debe realizarse mediante casting a Comparable dentro del árbol.

Implementar e imprimir en consola los recorridos:

InOrder
Implementaciones obligatorias
Implementación con objetos Persona
Crear la clase:

public class Persona implements Comparable<Persona>
La comparación debe basarse en el atributo edad

Usar la misma clase:

Tree<Persona>
Mostrar en consola:

InOrder

#### Evidencia 1 – Código fuente
**Evidencia de la práctica de Árboles – Implementación Genéricos uso de interfaces Comparable**
![alt text](assets/Evidencia4.png)
![alt text](assets/Evidencia5.png)


#### Evidencia 2 - Salida por Consola
**Evidencia salida por consola**
![alt text](assets/Evidencia3.png)

## Práctica de Graphs-Implementación de Grafos con Strings

### Fecha
2026-1-08
### Objetivo
#### Implementar un Grafo  en Java usando:

Node<T>
Graph<T>
### Requisitos técnicos
Implementar la clase genérica:

class Graph<T>
Implementar la clase:

class Node<T>
 
#### Implementaciones obligatorias
Implementación con objetos String
Entregable
Repositorio que contenga:

Código fuente actualizado
Carpeta assets/ con evidencias
README actualizado con la sección de esta práctica

### Evidencias Obligatorias
#### Captura 1
**Evidencia código fuente de la práctica de Graphs-- Implementación de Grafos con Strings**
![alt text](assets/Evidencia7.png)

#### Captura 2
**Evidencia salida por consola de la práctica de Graphs-- Implementación de Grafos con Strings**
![alt text](assets/Evidencia6.png)