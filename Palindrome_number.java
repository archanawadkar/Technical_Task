package Technical_Task;

import java.util.Scanner;
public class Palindrome_number {
     public static void main(String[]args) {
    	 
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter a number");
    	 
    	 int num=scan.nextInt();
    	 int originalnum=num;
    	 
    	 int rev=0;
    	while(num!=0)
    	{
    		rev=rev*10+num%10;
    		num=num/10;
    	}
    	 if(originalnum==rev)
    	 {
    		 System.out.println(originalnum+ "Palindrome number");
    	 }
    	 else
    	 {
    		 System.out.println(originalnum+ " NotPalindrome number");

    	 }
    	 
    	 
    	 
     }
	
	
	
	
}
