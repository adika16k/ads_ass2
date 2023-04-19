
public class MyArrayList<T> {
    private Object[] array;
    private int size;

    MyArrayList(){
        this.array = new Object[5];
        this.size = 0;
    }

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
    public void displayElements() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public T get(int index){
        return (T) array[index];
    }
    public void clear(){
        this.array = (T[]) new Object[5];
        this.size = 0;
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
        int temp = 0;
        for (int i=0;i<array.length;i++){
            for(int j=1;j< array.length-i;j++){
                if (array[j-1] != null && array[j] != null && (int) array[j-1] > (int) array[j]){
                    temp = (int) array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
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
