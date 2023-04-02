package Technical_Task;

public class Remove_Special_char {
    public static void main(String[] args) {
		
    	

		String s="#*?<!?_,<^%(@ latin string 01367";
		
		String s1="@#$@#$@ testing  #$%&^ selenium &*(^% java%$";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
    	
    	
    	
    	
    	
    	
    	
	}
}
