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
        return 0;
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
}
