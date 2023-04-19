public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList();
        arrayList.add(56);
        arrayList.add(1);
        arrayList.add(41);
        arrayList.add(85);
        arrayList.add(8);
        System.out.println("Before adding:");
        arrayList.displayElements();
        System.out.println();

        System.out.println("After adding:");
        arrayList.add(4);
        arrayList.displayElements();
    }
}