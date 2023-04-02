package Technical_Task;

import java.util.Arrays;

public class Remove_Dublicate_Array {
       public static void main(String[] args) {
	  
     int arr[]= {2,3,4,4,5,3,6,6};
     
 	 Arrays.sort(arr); //2,3,3,4,4,5,6,6
 	 
 	 int j=0;
 	 
 	 int length=arr.length;
 	// System.out.println(length); //8
 	 
 	 for(int i=0;i<length-1;i++)
 	 {
 		 //if value present in i & i+1 is not equal
 		 if(arr[i]!=arr[i+1])
 		 {
 			 arr[j++]=arr[i];  //2,3,4,5,6
 		 }
 	 }
 	 //last element of an array
 	 
 	 arr[j++]=arr[length-1];
 	 
 	 for(int k=0;k<j;k++)
 	 {
 		 System.out.print(arr[k]+" ");
 	 }
 	 
}
}
