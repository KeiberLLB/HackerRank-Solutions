package JavaList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      list.add(scan.nextInt());
    }
    int Q = scan.nextInt();
    for (int i = 0; i < Q; i++) {
      String queryType = scan.next();
      if (queryType.equals("Insert")) {
        int x = scan.nextInt();
        int y = scan.nextInt();
        list.add(x, y);
      } else if (queryType.equals("Delete")) {
        int x = scan.nextInt();
        list.remove(x);
      }
    }
    for (int num : list) {
      System.out.print(num + " ");
    }
    scan.close();
  }
}
