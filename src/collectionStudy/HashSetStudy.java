package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy 
{

	public static void main(String[] args) 
	{
		HashSet<Object> hs= new HashSet<>();
		System.out.println(hs.add("Ganesh"));
		hs.add(null);
		hs.add(null);    // only one null value is allowed in hashset
		System.out.println(hs.add("Ganesh")); // no dublicate variable is allowed
		hs.add(12);
		hs.add(52.50f);
		hs.add(true);
		
		System.out.println(hs);
		System.out.println(hs.add("Ravi")); // this method is used to add new name in list
		System.out.println(hs);
		System.out.println(hs.contains("Ganesh")); // this method is used to element is present in our list or not
		System.out.println(hs.isEmpty());  // this method is used to our list is empty or not in boolen value
		System.out.println(hs.remove("Ganesh"));  // this method is used to remove the element for our list
		System.out.println(hs);
		System.out.println(hs.size()); // this method is used to size of our list
		//hs.clear();      // this method is used to clear our list 
		//System.out.println(hs);
		System.out.println(hs.isEmpty()); // this method is used to our list is empty or not in boolean value
		
		System.out.println("==============for each loop===============================");
		for(Object he:hs)
		{
			System.out.println(he);
		}
		System.out.println("=====================iterator================================");
		Iterator<Object> hi = hs.iterator();	
		while(hi.hasNext())
		{
			System.out.println(hi.next());
		}
		
		
		

	}

}
