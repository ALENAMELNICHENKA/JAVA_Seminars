/*Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop(). */

public class S_4_Task_5_1{
    public static int[] arr;
    public static int size;
    public static int topIndex;

    public static void main(String[] args) {
        size = 5;
        topIndex = -1;
        arr = new int[size];
        System.out.println(size());
        System.out.println(empty());
        push(4);
        push(2);
        push(9);
        System.out.println(size());
        System.out.println(empty());
        System.out.println(pop());
        System.out.println(size());

    }

    public static int size() {

        return topIndex + 1;
    }

    public static boolean empty() {
        return topIndex == -1;
    }

    public static void push(int elem) {
        arr[++topIndex] = elem;

    }

    public static int peek() {
        return arr[topIndex];
    }

    public static int pop() {
        return arr[topIndex--];
    }

}
