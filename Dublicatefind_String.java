package Technical_Task;

public class Dublicatefind_String {

	public static void main(String[] args) {
		
		   String a= "codoid";
	       
		   char [] ch = a.toCharArray();
	    	 
	       for(int i=0;i<a.length();i++) 
	       { 
	    		for(int j=i+1;j<a.length();j++) 
	    		{
	    			if(ch[i]==ch[j])
	    			  {
	    				System.out.println("Found duplicate element:"+ch[i]);
	    				
	    			  }
	    			
	    		}
		
	      }		
		
	}
	
}
