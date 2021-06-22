public class Main {
    public static void main(String[] args) {
//        1. Реализовать основные методы связанного списка.
//        2. Реализовать основные методы ArrayList.

        task1();

       // task2();

    }

    private static void task1() {
        MyTwoSideLinkedList<String> myList = new MyTwoSideLinkedList();
        myList.insertFirst("B");
        myList.insert(0, "A");
        myList.insert(1, "C");

        System.out.println(myList);
    }

    private static void task2() {
        MyArrayList<Integer> myList= new MyArrayList<>();
        myList.add(2);
        myList.add(5);
        myList.add(1,3);
        System.out.println(myList);
        System.out.println(myList.get(0));
        System.out.println(myList.size());
        System.out.println(myList.capacity());
        myList.remove((Integer) 5);
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);

    }
}
