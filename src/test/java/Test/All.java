package Test;

import java.util.Arrays;
import java.util.Scanner;

public class All {

	
	public static void main(String[]args) {
		
     int num=155;
     int num1=0;
     
	for(int i=num;i>0;i=i/10) {
		int rem=i%10;
		num1=num1+(rem*rem*rem);
				
	}
	if(num==num1)	{
		System.out.println("armstrong num: "+ num);
	}
		
	else {
		System.out.println("not armstromg: "+ num);
	}
		
}
}