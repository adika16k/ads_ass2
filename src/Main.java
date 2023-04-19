public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList();
        arrayList.add(56);
        arrayList.add(1);
        arrayList.add(41);
        arrayList.add(85);
        arrayList.add(8);
        System.out.print(arrayList.get(2));
    }
}