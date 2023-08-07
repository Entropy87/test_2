import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;

public class Hash {
  public static void main(String[] args) throws Exception {
    if (args.length < 2) {
      System.err.println("Usage: java Hash <filename> <algorithm>");
     System.exit(1);
    }

    // Read bytes of the message

    Path path = Paths.get(args[0]);
    byte[] message = Files.readAllBytes(path);

    // Apply hash function
    MessageDigest md = MessageDigest.getInstance(args[1]);
    md.update(message);
    byte[] hash = md.digest();
    // Display hashMessageDigest cannot be resolve
     StringBuffer hexString = new StringBuffer();
     for (int i = 0;i<hash.length;i++) {
      hexString.append(Integer.toHexString(0xFF & hash[i]));
   }
   System.out.println("Hex format : " + hexString.toString());    
  }
}