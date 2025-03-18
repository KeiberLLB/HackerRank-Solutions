package JavaList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapAgenda {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine()); // Leer la cantidad de contactos
    Map<String, String> phoneBook = new HashMap<>(); // Crear el HashMap para almacenar los contactos

    // Leer los contactos y almacenarlos en el HashMap
    for (int i = 0; i < n; i++) {
      String name = scanner.nextLine(); // Leer el nombre
      String number = scanner.nextLine(); // Leer el número de telefono
      phoneBook.put(name, number); // Guardar en el HashMap
    }

    // Leer y procesar las consultas hasta el final del archivo (EOF)
    while (scanner.hasNext()) {
      String query = scanner.nextLine();
      if (phoneBook.containsKey(query)) {
        System.out.println(query + "=" + phoneBook.get(query));
      } else {
        System.out.println("Not found");
      }
    }

    scanner.close();
  }
}