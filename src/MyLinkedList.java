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
    public void add(Object item) {

    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void sort() {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }
}
