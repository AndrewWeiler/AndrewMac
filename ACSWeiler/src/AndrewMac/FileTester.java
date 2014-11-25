package AndrewMac;

/*import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTester {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("writeData/userInfo.txt");
		PrintWriter output = new PrintWriter(fw);
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("writeData/userInfo.txt", true)))) {
		    out.println("the text");
		}catch (IOException e) {
			 
		}
		
		//output.println("Hi Natalie");
		output.println("Hi Dr. R");
		output.close(); 
		fw.close();
	
	}
}
*/
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class FileTester
{ private String account;

   public FileTester(String data){
	   account = data;
	   
   }
 
   
   
   
   
   
   
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   /* {	
	   String name = "";
      try{
    	String content = "This is my content which would be appended " +
        	"at the end of the specified file";
        //Specify the file name and path here
    	File file =new File("writeData/userInfo.txt");

    	 This logic is to create the file if the
    	 * file is not already present
    	 
    	if(!file.exists()){
    	   file.createNewFile();
    	}
    	
    	//Here true is to append the content to file
    	FileWriter fw = new FileWriter(file,true);
    	//BufferedWriter writer give better performance
    	BufferedWriter bw = new BufferedWriter(fw);
    	bw.write("Hi Cole");
    	//Closing BufferedWriter Stream
    	bw.close();

	System.out.println("Data successfully appended at the end of file");

      }catch(IOException ioe){
         System.out.println("Exception occurred:");
    	 ioe.printStackTrace();
       }
   }
}*/