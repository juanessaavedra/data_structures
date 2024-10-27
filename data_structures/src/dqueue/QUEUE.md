# Queue (cola)
FIFO (First In First Out) es una estructura de datos que permite almacenar elementos y recuperarlos en el mismo orden en que fueron insertados.


- Ineficiente para acceso aleatorio a elementos
- Accede al primer elemento (frente) pero para acceder al ultimo se necesita recorrer toda la cola (no hay metodos directos)
- Busqueda de elementos especficos requiere recorrer la cola


# Methods 
Here are some of the most commonly used methods:
## Insert
- add(element): Adds an element to the rear of the queue. If the queue is full, it throws an exception. (enqueue)
- offer(element): Adds an element to the rear of the queue. If the queue is full, it returns false.
## Remove
- remove(): Removes and returns the element at the front of the queue. If the queue is empty, it throws an exception. (dequeue)
- poll(): Removes and returns the element at the front of the queue. If the queue is empty, it returns null.

## Examine
- element(): Returns the element at the front of the queue without removing it. If the queue is empty, it throws an exception.
- peek(): Returns the element at the front of the queue without removing it. If the queue is empty, it returns null.

## Size
- size(): Returns the number of elements in the queue.

## isEmpty
- isEmpty(): Returns true if the queue is empty, false otherwise.

## Clear
- clear(): Removes all elements from the queue.

## Contains
- contains(element): Returns true if the queue contains the specified element.

## Iterator
- iterator(): Returns an iterator that can be used to access the elements of the queue.

# Priority Queue
A priority queue is a queue that orders its elements based on their priority. The element with the highest priority is removed first. If two elements have the same priority, they are removed in the order they were added.

## Example
Standard queue
```java
import java.util.LinkedList;

Queue<Double> queue = new LinkedList<>();
queue.offer(3.0);
queue.offer(1.0);
queue.offer(2.0);

while (!queue.isEmpty()) {
    System.out.println(queue.poll());
}
```

Now, let's use a priority queue

```java
import java.util.PriorityQueue;

Queue<Double> queue = new PriorityQueue<>();
queue.offer(3.0);
queue.offer(1.0);
queue.offer(2.0);

while (!queue.isEmpty()) {
    System.out.println(queue.poll());
}
```

The output will be:
```
1.0
2.0
3.0
```

These are all in order now, because the priority queue orders the elements based on their natural ordering (in this case, the natural ordering of doubles).
If you want in reverse order, you can use collections.reverseOrder() as follows:

```java

import java.util.PriorityQueue;
import java.util.Collections;

Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
queue.offer(3.0);
queue.offer(1.0);
queue.offer(2.0);

while (!queue.isEmpty()) {
    System.out.println(queue.poll());
}
```

Another example:
```java
import java.util.PriorityQueue;

Queue<String> queue = new PriorityQueue<>();
queue.offer("A")
queue.offer("C")
queue.offer("B")
queue.offer("D")
queue.offer("F")

while (!queue.isEmpty()) {
    System.out.println(queue.poll());
}
```

The output will be:
```
A
B
C
D
F
```

As you can see, the elements are ordered alphabetically. If you want to order them in reverse order, you can use Collections.reverseOrder() again.


