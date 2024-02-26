/*📌ЗАДАЧА №4. Напишите метод, который находит самую длинную строку общего
префикса среди массива строк.
📌 Если общего префикса нет, вернуть пустую строку "". */

public class Task_4 {
    public static void main(String[] args) {
        String[] strings = { "flower", "flow", "flight" }; // fl
        System.out.println(getPrefix(strings));
    }

    private static String getPrefix(String[] strings) {
       
        String prefix = strings[0]; // fl
        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix)!=0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
                    
                }
                
            }
        return prefix;
    }
}
