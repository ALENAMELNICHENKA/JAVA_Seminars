/*📌 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
📌 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим. */
import java.util.ArrayList;
import java.util.LinkedList;

public class S_4_Task_1 {

    public static void main(String[] args) {
        int count = 10_000;

        System.out.println("Добавление в конец списка");
        //фиксируем начальное время для теста
        long start = System.currentTimeMillis();
        getArrayListAddLast(count);
        //тек.время минус стартовое
        System.out.println(System.currentTimeMillis() - start);

        //обновляем время для след. теста
        start = System.currentTimeMillis();
        getLinkedListAddLast(count);
        //тек.время минус стартовое
        System.out.println(System.currentTimeMillis() - start);
        System.out.println();
    }

    //метод добавления в конец
    public static ArrayList<Integer> getArrayListAddLast(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addLast(i);
        }
        return arrayList;
    }

    //теперь метод добавления в конец для LinkedList
    public static LinkedList<Integer> getLinkedListAddLast(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addLast(i);
        }
        return linkedList;
    }

    //а сейчас метод добавления в начало
    public static ArrayList<Integer> getArrayListAddFirst(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addFirst(i);
        }
        return arrayList;
    }

    //теперь метод добавления в начало для LinkedList
    public static LinkedList<Integer> getLinkedListAddFirst(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addFirst(i);
        }
          return linkedList;
    }

    //метод добавления в середину
    public static ArrayList<Integer> getArrayListAddMiddle(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(arrayList.size()/2, i);
        }
        return arrayList;
    }

    //метод добавления в середину для LinkedList
    public static LinkedList<Integer> getLinkedListAddMiddle(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(linkedList.size()/2, i);
        }
          return linkedList;
    }
}