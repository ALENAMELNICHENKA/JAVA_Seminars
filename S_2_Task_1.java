/*📌 Дано четное число N (>0) и символы c1 и c2.
📌 Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1. */

public class S_2_Task_1 {

    public static void main(String[] args) {
        int n = 10;
        char c1 = 'a';
        char c2 = 'b';
        //ababababab

        System.out.println(getAlternatingCharsString(n, c1, c2));
        System.out.println(getAlternatingSB(n, c1, c2));
    }

    public static String getAlternatingCharsString(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str += Character.toString(c1)  + Character.toString(c2);
            
        }
        return str;
    }

        
        // С помощью метода StringBuilder
    public static String getAlternatingSB(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
            
        }
        return sb.toString();
        
    }
}
