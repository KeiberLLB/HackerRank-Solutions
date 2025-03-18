package JavaList;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
  public static boolean isBalanced(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else {
        if (stack.isEmpty()) {
          return false; // Si hay un cierre sin apertura previa
        }
        char top = stack.pop();
        if ((ch == ')' && top != '(') ||
            (ch == '}' && top != '{') ||
            (ch == ']' && top != '[')) {
          return false; // Si los caracteres no coinciden
        }
      }
    }
    return stack.isEmpty(); // Debe estar vacío si está bien balanceado
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) { // Leer hasta EOF
      String line = scanner.next();
      System.out.println(isBalanced(line));
    }

    scanner.close();
  }
}
