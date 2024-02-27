/*📌 Задача №5.
Напишите метод, который вернет содержимое текущей папки в виде
массива строк.
📌 Напишите метод, который запишет массив, возвращенный предыдущим
методом в файл.
📌 Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл. */

import java.io.File;
import java.io.FileWriter;
//import java.lang.reflect.Array;
//import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



public class S_2_Task_5 {
    private static Logger logger = Logger.getLogger(S_2_Task_5.class.getName());
    public static void main(String[] args) {
        configLogger();
        String[] contentfolder = getContentFolder(".");
        //System.out.println(Arrays.toString(contentfolder));
        writeToFile(contentfolder, "file.txt");

    }

    //метод, который вернет содержимое текущей папки в виде массива строк.
    public static String[] getContentFolder(String folderName) {

        File folder = new File(folderName);
        return folder.list();
    }

    //метод, который запишет массив, возвращенный предыдущим методом в файл.
    public static void writeToFile(String[] strs, String fileName){

        //для исключения ошибок метод try_cath
        try (FileWriter fw = new FileWriter(fileName)) {
            for (String str : strs) {
                fw.write(str);
                fw.write(System.lineSeparator());
            }
            //System.out.println("Данные успешно записаны в файл");
            logger.log(Level.INFO, "Данные успешно записаны в файл");
        } catch (Exception e) {
            //System.err.println("Ошибка записи файла");
            logger.warning("Ошибка записи файла");
        }

      }  

      //Метод для настройки Логгера, чтобы выводил инфу в файл, а не в консоль
    public static void configLogger() {
          try {
        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
 }
