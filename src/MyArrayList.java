public class MyArrayList {
    private int[] array;
    private int size = 0;

    public void add(int element){
        if (size == array.length){

        }
    }
    public void changeSize(){
        int[] newArray = new int[array.length * 2];
        for (int i=0; i< array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public int get(int index){
        return array[index];
    }
    public void remove(int index) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }
}
