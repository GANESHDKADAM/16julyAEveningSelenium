package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lh= new LinkedHashSet<>();
		System.out.println(lh.add("Ravi"));
		//System.out.println(lh.add("Ravi")); // dublicate element not allowed
		lh.add(null);
		//lh.add(null); // only one null element is allowed
		lh.add(15);
		lh.add(58.78f);
		lh.add(true);
		
		System.out.println(lh);
		lh.add("Ganesh");  // this method is used add the new element in our list
		System.out.println(lh);
		System.out.println(lh.clone()); // this method is used to create the dublicate list
		System.out.println(lh.contains("Ravi"));
		System.out.println(lh.isEmpty()); // this method is used to our list is empty or not
		System.out.println(lh.remove("Ravi")); // this method is used to remove the element from our list
		System.out.println(lh);
		System.out.println(lh.size()); // this method is used to size of our list
		//lh.clear();
		//System.out.println(lh);
		System.out.println("============for each loop========================");
		for(Object l:lh)
		{
			System.out.println(l);
		}
		
		System.out.println("=================iterator======================");
		Iterator<Object> li = lh.iterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
				
		
		
		
		

	}

}
