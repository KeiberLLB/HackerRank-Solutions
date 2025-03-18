package String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        
        while (scanner.hasNext()) {
            String ip = scanner.next();
            System.out.println(Pattern.matches(myRegex.pattern, ip));
        }

        scanner.close();

    }
}
class MyRegex {
    String pattern = "^((25[0-5]|2[0-4]\\d|1\\d\\d|0\\d{2}|[1-9]?\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|1\\d\\d|0\\d{2}|[1-9]?\\d)$";
}
