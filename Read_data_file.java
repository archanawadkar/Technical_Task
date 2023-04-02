package Technical_Task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_data_file {
      
       public static void main(String[] args) throws IOException {
			   
    	   
    	   FileReader fr=new FileReader("C:\\Users\\Archana\\OneDrive\\Documents\\note.txt");
    	   
    	   BufferedReader br=new BufferedReader(fr);
    	   
    	   String str;
    	   
    	   while((str=br.readLine())!=null)
    	   {
    		   System.out.println(str);
    	   }
    	   br.close();
	}
}
