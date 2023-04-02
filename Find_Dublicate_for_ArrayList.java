package Technical_Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Dublicate_for_ArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> list=new ArrayList();//acept dublicate,null
    	list.add("Velocity");
    	list.add("Archana");
    	list.add("Barkha");
    	list.add("Archana");
    	list.add("Barkha");
    	
    	Set<String>s=new HashSet<>();
    	
    	for(String name : list) 
    	{
    		if(s.add(name)==false)
    		System.out.println(name); 
    			
    	}
    		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
}