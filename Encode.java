//Decode a decode.txt file
import java.util.Scanner;
import java.io.*;

public class Encode {
   public static void main (String[] args) throws ClassNotFoundException, IOException {
   
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter a filename to encode : ");
   
    ObjectInputStream in = new ObjectInputStream(
      new FileInputStream(new File(input.next())));  
	  
		 String[] newEncode = (String[])(in.readObject());		
		 //Read data from the first file into the array
		 for ( int i = 0; i < newEncode.length; i++) {
		    System.out.print(newEncode[i]);				
         }
		 System.out.println();		 
		 in.close();		 
		
	Scanner input2 = new Scanner(System.in);
	
	System.out.print("Enter a filename to encode with: ");	
	
	ObjectInputStream in2 = new ObjectInputStream(
	   new FileInputStream(new File(input2.next())));
		 
		 String[] newDecode = (String[])(in2.readObject());
		 //Read data from the second file into the array
		 for ( int j = 0; j < newDecode.length; j++ ) {
		    System.out.print(newDecode[j]);
		 }
		 System.out.println();
		 in2.close();
		 
		 //Write new changed values into the new file decoded.dat 
		ObjectOutputStream outencoded = new ObjectOutputStream(
		    new FileOutputStream("decoded.dat", true));
		 System.out.println("Decoded letters in a new encoded.dat file :");
		 for ( int i = 0; i < newDecode.length; i++ ) {			
            if( newEncode[i] == newEncode[i].toUpperCase()) {	
               newDecode[i].toUpperCase();			 	
            }
			if(newEncode[i] == newEncode[i].toUpperCase()) {
			   newDecode[i].toLowerCase();			  
			}
             newEncode[i] = newDecode[i];	
             System.out.print(newDecode[i]);			 
		 }
		 outencoded.writeObject(newDecode);        	 
	     outencoded.close();
	
	}
}