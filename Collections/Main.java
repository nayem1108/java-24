package Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let\'s recap collection framework");

        // 9 key interface in Collecition frameworks
        // Collection, List, Set, SortedSet, NavigableSet, Queue, Map, SortedMap,
        // NavigableMap

        /**
         * Interface provide mush information than a class. Classes are just a dummy
         * things
         */

        // 1. Collection:

        /*
         * A group of individual objects as a single entity then used Collection(I)
         * It is defines the most common methods which are applicable for all other -
         * objects
         * Collection is an Interface
         * List, Set, queue implements the Collection
         * 
         */

        /**
         * Methods
         * 
         * add(Object) //add an object to the collection
         * addAll(Collection of Object) add a collection to the collectio
         * clear() //Removes all the elements from this collection (optional operation).
         * 
         * contains(Object) //Returns true if this collection contains the specified
         * element. *
         * containsAll(Collection of Object) //Returns true if this collection contains
         * all the elements in the specified collection.
         * 
         * equals(Object) //Compares the specified object with this collection for
         * equality.
         * 
         * hashCode() //Returns the hash code value for this collection.
         * 
         * isEmpty()
         * iterator()
         * parallelStream()
         * remove(Object)
         * removeAll(Collection of Object)
         * removeIf(Predicate(condition goes here) filter)
         * retainAll(Collection of Object)
         * size() //return size of the collection
         * spliterator()
         */
    }
}
