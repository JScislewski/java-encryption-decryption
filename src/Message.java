public class Message {
  public static final int A = 97;
  public static final int Z = 122;
  private String encrypted;
  private String decrypted;
  private int key;

  public Message(String command, String input, int key) {
    this.key = key;
    if (command.equals("encrypt")) {
      decrypted = input.toLowerCase();
      encrypt();
    } else {
      encrypted = input.toLowerCase();
      decrypt();
    }
  }

  public String getEncrypted() {
    return encrypted;
  }

  public void setEncrypted(String encrypted) {
    this.encrypted = encrypted;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public String getDecrypted() {
    return decrypted;
  }

  public void setDecrypted(String decrypted) {
    this.decrypted = decrypted;
  }

  private void encrypt() {
    StringBuilder encryptedBuilder = new StringBuilder();
    for (int i = 0; i < decrypted.length(); i++) {
      char currentChar = decrypted.charAt(i);
      if (currentChar >= A && currentChar <= Z) {
        char encryptedChar = ((char) (currentChar + key));
        if (encryptedChar > Z) {
          encryptedChar = (char) (A + (encryptedChar % 123));
        }
        encryptedBuilder.append(encryptedChar);
      } else {
        encryptedBuilder.append(currentChar);
      }
    }
    encrypted = encryptedBuilder.toString();
  }

  private void decrypt() {}

  @Override
  public String toString() {
    return (
      "Message{" +
      "encrypted='" +
      encrypted +
      '\'' +
      ", decrypted='" +
      decrypted +
      '\'' +
      ", key=" +
      key +
      '}'
    );
  }
}
