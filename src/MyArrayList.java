
public class MyArrayList<T> implements Mylist1<T> {
    private Object[] array;
    private int size;

    MyArrayList(){
        this.array = new Object[5];
        this.size = 0;
    }
    @Override
    public void add(T element) {
        if (size == array.length){
            changeSize();
        }
        array[size++] = element;
    }

    @Override
    public void changeSize() {
        Object[] newArray = new Object[array.length * 2];
        for (int i=0; i< array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public void displayElements() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public void clear() {
        this.array = (T[]) new Object[5];
        this.size = 0;
    }

    @Override
    public void remove(int index) {
        for (int i = index + 1; i < size; i++) {
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

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void removeFirst() {

    }
}
