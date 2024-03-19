package Cat2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class MainCat2 {
    public static void main(String[] args) {
       Cat2 cat1 = new Cat2("Барсик", 6, "Черный");
       Cat2 cat2 = new Cat2("Марсик", 4, "Белый");
       Cat2 cat3 = new Cat2("Мурка", 2, "Серый"); 
       Cat2 cat4 = new Cat2("Мурка", 2, "Серый"); /*2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
                                               Убедитесь, что все они сохранились во множество. */
//1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
//Поместите в него некоторое количество объектов. 
       Set<Cat2> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4)); 
//Распечатаем:
       for (Cat2 cat : cats) {
        System.out.println(cat);
        
       }
              
       
    }
    
}
