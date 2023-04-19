# ads_ass2

We need to create classes MyArrayList and MyLinkedList which are implementations of ArrayList and LinkedList respectively.

I create class andd add there methods like add, sort, remove and etc.

### Main
~~~java
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList(); // by <Integer> we give data type for elements in array
        arrayList.add(56); // adding elements to array
        arrayList.add(1);
        arrayList.add(41);
        arrayList.add(85);
        arrayList.add(8);

        System.out.println("After sorting:");
        arrayList.sort(); // sorting an array
        arrayList.displayElements(); // print elements of array to console
        System.out.println();

        System.out.println("Before adding:");
        arrayList.displayElements();
        System.out.println();

        System.out.println("After adding:");
        arrayList.add(4); // add element 4 to last for array
        arrayList.displayElements();
        System.out.println();

        System.out.println("After removing fourth element:");
        arrayList.remove(4); //remove element from index 4 of array
        arrayList.displayElements();
        System.out.println();

        System.out.println("After sorting:");
        arrayList.sort();
        arrayList.displayElements();
        System.out.println();
    }
}
~~~

### MyArrayList 
~~~java

public class MyArrayList<T> implements Mylist1<T> {
    private Object[] array; // Object it is when elements can take all reference types like String, Integer and etc
    private int size; // size its length of array

    MyArrayList(){
        this.array = new Object[5];
        this.size = 0;
    }
    @Override
    public void add(T element) {
        if (size == array.length){ // it checks if array is full by comparing its size and length
            changeSize();
        }
        array[size++] = element;  // if true size increased by 1 and after that we can add an element
    }

    @Override
    public void changeSize() {
        Object[] newArray = new Object[array.length * 2]; // creating new array which length will be more twice than first array
        for (int i=0; i< array.length; i++){
            newArray[i] = array[i]; // giving new array elements of first array
        }
        array = newArray;
    }

    @Override
    public void displayElements() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " "); // to write console all elements of array
        }
    }

    @Override
    public T get(int index) {
        return (T) array[index]; // get inputed index of array
    }

    @Override
    public void clear() {
        this.array = (T[]) new Object[5]; // it's like to update the array for zero
        this.size = 0;
    }

    @Override
    public void remove(int index) {
        for (int i = index + 1; i < size; i++) { // remove given index of element
            array[i - 1] = array[i];
        }
        size--;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void sort() {
        int temp = 0; // it's bubble sort of array
        for (int i=0;i<array.length;i++){  // bubble sort is to compare all elements of array by two elements
            for(int j=1;j< array.length-i;j++){
                if (array[j-1] != null && array[j] != null && (int) array[j-1] > (int) array[j]){
                    temp = (int) array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Override
    public void removeLast() {
        size--; // to remove last element of array we can just decrease size for by one
    }

    @Override
    public void removeFirst() {
        for (int i=0; i<size-1;i++){
            array[i] = array[i+1]; // it's method to remove first element of array
        }
        size--;
    }
}

~~~

### MyLinkedList
~~~java
public class MyLinkedList<T> implements MyList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }
    private static class Node<E>{
        E data;
        Node<E> next;
        Node(E data){
            this.data = data;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public void clear() {
        head =null;
        tail =null;
        size =0;
    }

    @Override
    public T get(int index) {
        Node<T> current = head;
        for (int i =0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    @Override
    public void sort() {

    }

    @Override
    public void removeFirst() {
        if (head == tail){
            head = tail = null;
        } else{
            head = head.next;
        }
        size--;
    }

    @Override
    public void removeLast() {
        if (head == tail){
            head = tail = null;
        } else {
            Node<T> current = head;
            while (current.next != tail){
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
        size--;
    }
}
~~~

### MyList1
~~~java
public interface Mylist1<T> {
    void add(T element);
    void changeSize();
    void displayElements();
    T get(int index);
    void clear();
    void remove(int index);
    int getSize();
    void sort();
    void removeLast();
    void removeFirst();
}
~~~

### MyList
~~~java
public interface MyList<T> {
    int size();
    void add(T item);
    boolean remove(T item);
    void clear();
    T get(int index);
    void sort();
    void removeFirst();
    void removeLast();
}
~~~
