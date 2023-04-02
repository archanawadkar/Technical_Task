package Technical_Task;

public class ArmstrongNum {
    public static void main(String[]args) {
	//153---->1^3 + 5^3 + 3^3
    	
    int num=407;
	int num1=0;
	
	for(int i=num;i>0;i=i/10) {
		int rem=i%10 ;
		num1=num1+(rem*rem*rem);
		
	}
	if(num==num1)
	{
		System.out.println("The num is " + num + " Armstrong num");
	}
	
	else
	{
		System.out.println("The num is " + num + " Not armstrong");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}