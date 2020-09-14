public class Message {
  private String encrypted;
  private String decrypted;
  private int key;

  public Message(String encrypted, String decrypted, int key) {
    this.encrypted = encrypted;
    this.decrypted = decrypted;
  }

  public String getEncrypted() {
    return encrypted;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public void setEncrypted(String encrypted) {
    this.encrypted = encrypted;
  }

  public String getDecrypted() {
    return decrypted;
  }

  public void setDecrypted(String decrypted) {
    this.decrypted = decrypted;
  }
}
