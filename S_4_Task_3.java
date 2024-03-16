/*Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.*/

import java.util.LinkedList;
import java.util.Scanner;

public class S_4_Task_3 {
   
    public static void main(String[] args) {
        LinkedList<String> linkList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        
    while (true) {
        System.out.println("Введите строку для добавления в список");
        System.out.println("print - для вывода в обратном порядке списка");
        System.out.println("revert - для удаления последней строки из памяти");
        System.out.println("exit - для выхода из программы");
        System.out.println();
        String inputData = scan.nextLine();
        
        if(inputData.equals("exit")) 
        break;

        if(inputData.equals("print")) {
            for (int i = linkList.size()-1; i >= 0; i--) {
                System.out.print(linkList.get(i) + " ");
            }
            System.out.println();
        } else if (inputData.equals("revert")) {
            if (!linkList.isEmpty()) linkList.removeLast();
            System.out.println(linkList);
        } else {
            linkList.add(inputData);
            System.out.println(linkList);
        }
            
    }  
    scan.close(); 
                 
}
}