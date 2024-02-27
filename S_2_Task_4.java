/* Тема: Файлы. Задача №4.
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения. */

import java.io.FileWriter;

public class S_2_Task_4 {
    public static void main(String[] args) {
        
    int repeat = 100; 
    String str = repeatWord("TEST", repeat);
    writeToFile(str, "text.txt");
    }
    //Создаём метод для повторения "TEST" repeat раз:
    public static String repeatWord(String word, int repeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(word).append(" ");
            
        }
        
        return sb.toString(); 
    }

    //Создаём метод, кот. запишет строку в простой текстовый файл:
    public static void writeToFile(String str, String fileName){

        //для исключения ошибок метод try_cath
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(str);
            System.out.println("Данные успешно записаны в файл");
            
        } catch (Exception e) {
            System.err.println("Ошибка записи файла");
        }
        

    }
}
