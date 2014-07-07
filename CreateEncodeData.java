//Create .dat files for encode
import java.io.*;

public class CreateEncodeData {
  public static void main(String[] args)
      throws ClassNotFoundException, IOException {    
    String[] encode = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", 
	       "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    // Create an output stream for file encode.dat
    ObjectOutputStream output = new ObjectOutputStream(new 
      FileOutputStream("encode.dat", true));

    // Write arrays to the object output stream
    output.writeObject(encode);   

    // Close the stream
    output.close();
   }
}	