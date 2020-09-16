package encryptdecrypt;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/** @author Jakub Ściślewski */
public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8)) {
      String command = scanner.nextLine();
      String input = scanner.nextLine();
      int key = scanner.nextInt();
      Message message = new Message(command, input, key);
      if (command.equals("enc")) {
        System.out.println(message.getEncrypted());
      } else {
        System.out.println(message.getDecrypted());
      }
      //System.out.println(message);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
