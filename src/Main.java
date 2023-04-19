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