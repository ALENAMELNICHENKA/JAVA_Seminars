/*1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди. */


import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class S_4_Task_4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 12, 34, 56};
        Stack<Integer> stack = new Stack<>();
        for (int element : arr) {
            stack.push(element);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        
    //создаем очередь
    Queue<Integer> queue = new LinkedList<>(); 
    for (int element : arr) {
        queue.add(element);
    }
    System.out.println(queue);


    
    }
    
}
