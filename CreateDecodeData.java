//Create .dat files for the decode
import java.io.*;

public class CreateDecodeData {
   public static void main(String[] args) throws ClassNotFoundException, IOException {
      String[] decode = {"K", "n", "g", "c", "a", "D", "s", "x", "b", "v", "f", "h", "j", "t", "i", "u",
	     "m", "y", "l", "z", "q", "r", "o", "p", "W", "e"};
	  
	  //Create an output stream for file decode.dat
	  ObjectOutputStream output = new ObjectOutputStream(
	     new FileOutputStream("decode.dat", true));
		 
		 //Write data to the stream
		 output.writeObject(decode);
		 
		 //Close the object
		 output.close();
   }
}