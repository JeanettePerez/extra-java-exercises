package codewithmosh.generics;

import java.util.Iterator;

// ========= Generic Classes =========
//public class GenericList<T> { // T: template, it's a type f object you want to store in the list E: element class for collections
//    private T[] items = (T[]) new Object[10]; // you can cast the results of the new object to the T array
//    private int count;
//
//    public void add(T item) { // the type of T will be determined later
//        items[count++] = item;
//    }
//
//    public T get(int index){
//        return items[index];
//    }
// ========= Constraints ===========
// When you want to add a restriction on type parameter
// when placing extends number you are say T can only be a Number Class or it's child classes
//public class GenericList<T extends Comparable & Cloneable> { // list can only store items that are comparable and cloneable
//   // the T is a bonded type parameter restricted*
//    private T[] items = (T[]) new Object[10];
//    private int count;
//
//    public void add(T item) { // the type of T will be determined later
//        items[count++] = item;
//    }
//
//    public T get(int index){
//        return items[index];
//    }
// =========== Type Erasure
    // compile after runtime will set the T to object in the byte code
    // if there is a constraint then the T will be replaced with the constraint
//    public class GenericList<T> {
//        private T[] items = (T[]) new Object[10];
//        private int count;
//
//        public void add(T item) { // the type of T will be determined later
//            items[count++] = item;
//        }
//
//        public T get(int index){
//            return items[index];
//        }
 // ========== Interface Comparable <T>
 //  T is the Type parameter
// ========= The iterable Interface
public class GenericList<T> implements Iterable{
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) { // the type of T will be determined later
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }

// ========= The iterable Interface / The Iterator interface
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this); // knows how to iterate over a generic list because of the class below implementing Iterator<>
    }
    // create a class that implements the iterator interface
    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index;
        // implement methods
        // in the class you want to iterate over a generic list pass the list with  constructor
        public ListIterator(GenericList<T> list) {
            this.list = list;

        }
        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }

}
