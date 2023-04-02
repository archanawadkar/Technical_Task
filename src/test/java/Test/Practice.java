package Test;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Practice {
	
	
	public static void main(String[]args) {
		
		
	
		int a[]= {2,5,76,8,43,14,98,5,2,8};
		
	
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.print(a[j]+" ");

				}
				
				
			}
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
}
