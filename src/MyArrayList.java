
public class MyArrayList<T> {
    private Object[] array;
    private int size = 0;

    public void add(T element){
        if (size == array.length){
            changeSize();
        }
        array[size++] = element;
    }
    public void changeSize(){
        Object[] newArray = new Object[array.length * 2];
        for (int i=0; i< array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public T get(int index){
        return (T) array[index];
    }
    public void remove(int index) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }
    public int getSize(){
        return size;
    }
    public void sort(){
        int arr[];
        int temp = 0;
        for (int i=0;i<array.length;i++){
            for(int j=0;j< array.length-1;j++){
                if (array[j-1] > array[j]){

                }
            }
        }
    }
    public void removeLast(){
        size--;
    }
    public void removeFirst(){
        for (int i=0; i<size-1;i++){
            array[i] = array[i+1];
        }
        size--;
    }
}
