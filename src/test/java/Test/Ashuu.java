package Test;

public class Ashuu {

	public static void main(String[] args) {
		
	String a="Hi i am archu    he   ";
	int count=1;
	for(int i=0;i<=a.length()-1;i++) {
		if((a.charAt(i)==' ')&&(a.charAt(i+1)!=' ')) {
			count++;
		}
	}
	System.out.println(count);
	
	
	
	
	
	
	
	
	
	
	}
}
