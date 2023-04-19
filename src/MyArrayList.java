
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

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int getSize() {
        return 0;
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
