
package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Ashu {
   
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num=scan.nextInt();
		
		int origin=num;
		
		
		int count =0;
		
		if(num>1) {
			
			for(int i=1;i<=num;i++) {
				if(num%i==0){
					count++;

					//int num1=;
				}
			}
			if(count==2) {
				System.out.println("The number is prime");
			}
			else {
				System.out.println("The number is not prime");
			}
		}
		
		
		
		
		
		
	}
	
	
	
}
