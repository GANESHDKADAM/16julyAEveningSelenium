package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy 
{

	public static void main(String[] args) 
	{
		TreeSet<Object> ts= new TreeSet<>();
		ts.add(12);
		//ts.add("Ganesh"); // not allowed string because in treeset only use in homegenius data that why not use class case exception
		//ts.add(null);   // not allowed null value because null exception 
		ts.add(14);
		ts.add(16);
		ts.add(18);
		ts.add(8);
		ts.add(22);
		ts.add(6);
		ts.add(45);
		
		System.out.println(ts);
		System.out.println(ts.add(50)); // this method is used to add new element in our list
		System.out.println(ts);
		System.out.println(ts.clone()); // this method is used to create the duplicate list
		System.out.println(ts.first()); // this method is used to provide the first element in the list
		System.out.println(ts.floor(58)); // this method is used to provide the nearest no of our list
		System.out.println(ts.higher(89));  // this method is used to not in higher no that time show the null value
		System.out.println(ts.isEmpty()); // this method is used to return the boolean value
		System.out.println(ts.last());  // this method is used last no of our list
		System.out.println(ts.pollFirst());  //this method is used first element of our list
		System.out.println(ts.pollLast());// this method is used to last element of our list
		System.out.println(ts.remove(50));  // this method is used to remove the element from list
		System.out.println(ts);
		System.out.println(ts.size());  // this method is used to size of our list
	   // ts.clear();
	    //System.out.println(ts);
		System.out.println(ts.isEmpty());
		
		System.out.println("============for each loop====================");
		for(Object te:ts)
		{
			System.out.println(te);
		}
		System.out.println("===============iterator========================");
		Iterator<Object> ti = ts.iterator();
		while(ti.hasNext())
		{
			System.out.println(ti.next());
		}
		
		

	}

}
