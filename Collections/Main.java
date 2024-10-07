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
         * isEmpty() //Returns true if this collection contains no elements.
         * 
         * iterator()
         * parallelStream()
         * remove(Object) //Removes a single instance of the specified element from this
         * collection, if it is present (optional operation).
         * 
         * removeAll(Collection of Object) //Removes all of this collection’s elements
         * that are also contained in the specified collection (optional operation).
         * 
         * removeIf(Predicate(condition goes here) filter) //Removes all the elements of
         * this collection that satisfy the given predicate.
         * 
         * retainAll(Collection of Object) //Retains only the elements in this
         * collection that are contained in the specified collection (optional
         * operation).
         * 
         * size() //return size of the collection
         * spliterator()
         * 
         * toArray() //Returns an array containing all the elements in this collection.
         * 
         * stream() //Returns a sequential Stream with this collection as its source.
         * 
         * 
         * forEach​(Consumer<? super T> action) //java.lang.iterable
         * 
         */

        /***
         * 
         * Difference between collection vs collections
         * 
         * Collection is a Interface and Collections is a class(Utility class)
         * 
         * Collection is a Interface and Collections utility class present
         * java.util.package
         * 
         * 
         * 
         */
    }
}
