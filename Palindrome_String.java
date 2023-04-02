package Technical_Task;

import java.util.Scanner;

public class Palindrome_String {
      public static void main(String[]args) {
    	  
    	  Scanner scan=new Scanner(System.in);
    	  System.out.println("Enter a String");
    	  String name=scan.next();
    	  String original=name;
    	  
    	    String rev="";
          int length=name.length();   	 
    	  for(int i=length-1;i>=0;i--) {
    		 rev=rev+name.charAt(i);
    	  }
    	  if(original.equals(rev)) {
    		  System.out.println(original +" is PalindromeString");
    	  }
    	  
    	  else
    	  {
    		  System.out.println(original +"  NotPalindromeString");
  
    	  }
    	  	  
      }

}
