# algorithms-and-data-structures

# Algoritmos y estructuras de datos.

## Gracias por visitar el repositorio! :smiley:
La idea es que sirva como repaso o introducción básica para las estructuras de datos y los algoritmos. Tratare de irlo actualizando de a poco, para ir aumentando la complejidad de las estructuras y los algoritmos.
¡Ante cualquier consulta no dudes en escribir!

**Indice**
   
1. Estructuras de datos
   1. [Lista](#item1)
   

<a name="item1"></a>
### 1.1 Lista

Lista enlazada, es una estructura de datos fundamental, que puede ser usada para crear otras estructuras de datos.
Consiste en una secuencia de nodos, en los que se guardan campos de datos arbitrarios y una o dos referencias, enlaces o punteros al nodo posterior o anterior.
El principal beneficio de las listas enlazadas respecto a los vectores convencionales es que el orden de los elementos enlazados puede ser diferente al orden de almacenamiento
en la memoria o el disco, permitiendo que el orden de recorrido de la lista sea diferente al de almacenamiento.
En una lista enlazada simple de nodos, donde cada nodo tiene un único campo de enlace (además del campo donde se guarda el dato). Este enlace contiene una referencia al siguiente nodo, 
cada nodo (excepto el último) enlaza con el nodo siguiente, y el enlace del último nodo contiene NULL para indicar el final de la lista.

En el repo encontraras una implementación personalizada de una lista. Las operaciones básicas que se pueden realizar sobre una lista son: Crear, Insertar, Eliminar
y consultar si esta vacía. La implementación que aquí se encuentra, tiene algunas operaciones más. 
Claro que la mayoría de los lenguajes de programación tienen su propio tipo de Lista, de hecho, esta implementación está hecha con fines educativos.
Por ejemplo,en Java puedes encontrar la interfaz [List<E>](https://docs.oracle.com/javase/8/docs/api/java/util/List.html).

