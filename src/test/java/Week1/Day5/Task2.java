package Week1.Day5;

import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        String text="Notepad++ 8.1.1 release";
        String result=text.replace("8.1.1","9");
   //     System.out.println(result);
        String ucase=result.toUpperCase();
        System.out.println(ucase);
        String lcase=result.toLowerCase();
        System.out.println(lcase);

    }
}
