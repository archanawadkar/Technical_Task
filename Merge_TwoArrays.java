package Technical_Task;

public class Merge_TwoArrays {
    public static void main(String[] args) {
		
    	
        int a[] = { 21, 30, 42 ,44, 10};  // first array  
        
        int b[] = { 12, 22, 8, 18, 47 };  // second array
     
        int a1 = a.length; // determining length of first array
       
        int b1 = b.length;  // determining length of second array
    
        int c1 = a1 + b1; // resultant array size
  
        int[] c = new int[c1];  // Creating a new array
  
        for (int i = 0; i < a1; i++) //Loop to store the elements of first array into resultant array
        {
            c[i] = a[i];  // Storing the elements in the resultant array
        }
  
        for (int i = 0; i < b1; i++) // Loop to concat the elements of second array into resultant array
        {      
            c[a1 + i] = b[i]; // Storing the elements in the resultant array
        }
  
        for (int i = 0; i < c1; i++) // Loop to print the elements of resultant array after merging
        {           
            System.out.print(c[i]+" "); // print the element
        }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
