package encryptdecrypt;

public class Message {
  private String encrypted;
  private String decrypted;
  private int key;

  public Message(String command, String input, int key) {
    this.key = key;
    if (command.equals("enc")) {
      decrypted = input;
      encrypt();
    } else {
      encrypted = input;
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
      char encryptedChar = ((char) (currentChar + key));
      encryptedBuilder.append(encryptedChar);
    }
    encrypted = encryptedBuilder.toString();
  }

  private void decrypt() {
    StringBuilder decryptedBuilder = new StringBuilder();
    for (int i = 0; i < encrypted.length(); i++) {
      char currentChar = encrypted.charAt(i);
      char encryptedChar = ((char) (currentChar - key));
      decryptedBuilder.append(encryptedChar);
    }
    decrypted = decryptedBuilder.toString();
  }

  @Override
  public String toString() {
    return (
      "encryptiondecryption.encryptdecrypt.Message{" +
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
