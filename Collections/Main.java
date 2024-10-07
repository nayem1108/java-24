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

        /***
         * 
         * Collection (1.2 version )
         * |
         * ..................................
         * | | |
         * List(1.2) Set Queue
         * 
         * 
         */

        /****
         * 
         * List Interface
         * 
         * Usages:
         * want to represent group of object where duplicate entities allowed and when
         * insertion order is preserved
         * 
         * List is a child interface of Collection interface
         * Implementation Classes: ArrayList(1.2), LinkedList(1.2), Vector(Stack under
         * Stack)(v-1.0 came)
         * 
         * 
         */

        /****
         * 
         * Set Interface
         * 
         * Usages:
         * want to represent group of object where duplicate entities are not allowed
         * and when Insertion order not preserved
         * 
         * Came on version 1.xx
         * 
         * Set is a child interface of Collection interface
         * Implementation Classes: HashSet(LinkedHashSet(1.4v))(1.2)
         * 
         * 
         */

        /*****
         * 
         * Differencr between List Vs Set
         * 
         * List Allowes duplicate Vs Set do not allows duplicate
         * Insertion order preserved Vs Insertion order not preserved
         * 
         * 
         */

        /**
         * 
         * SortedSet(Interface)(1.2v)
         * Child interface of Set
         * 
         * Usages
         * No duplicated and insert according to some sorting order
         * 
         */

        /**
         * 
         * NavigableSet(Interface)(1.6v)
         * Child interface of SortedSet
         * 
         * Usages
         * For navigation purperse
         * 
         * Implementation Class TreeSet(1.2)
         */

        /**
         * 
         * Queue Interface(1.5v)
         * 
         * Usages:
         * Child interface of Collection
         * In order of data prior to processing FIFO (Sent 1000 email)
         * 
         * Implementation Classes
         * Priority Queue, Blucking Queue(LinkedBluckingQue, PriorityBluckingQueue)
         * 
         * 
         * 
         */

        /**
         * 
         * 
         */

        // Map(1.2)

        /**
         * Map is a different Interface not a child of Collection, these are totally
         * differend
         * Stores Key Value pair
         * where key is a object and value also a object
         * 
         * Usages
         * If we want to represent a group of object as key->value pair
         * Key can't be duplicate but value can
         * 
         * Child interface sortedMap(NavigableMap(1.6) impl class TreeMap(1.2))
         * 
         * Inplementaition classes:
         * HashMap(LinkedHashMap(1.4))(1.2), WeakHashMap(1.2), IdentityHashMap(1.4),
         * Hashtable((properties)comes from dictionary)(1.0)
         */
    }
}
