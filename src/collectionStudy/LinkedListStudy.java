package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy 
{

	public static void main(String[] args) 
	{
		LinkedList<Object> li= new LinkedList<>();
		li.add("Ganesh");
		li.add("Raj");
		li.add(null);
		li.add(null);
		li.add(null);
		li.add("Ganesh");
		li.add(25.55f);
		li.add(25);
		li.add("Pune");
		li.add(575.58f);
		
		System.out.println(li);
		
		li.add(2, "Ravi"); // this method use the new name add in mentioned index no
		System.out.println(li);
		li.addFirst("Vijay");  // this method use the new name add in our list in fist stage
		System.out.println(li);
		li.addLast("Kiran");   // this method use the new name add in our list in last stage
		System.out.println(li);
		Object li1 = li.clone();// this method use the duplicate list create on same on first list
		System.out.println(li1);
		System.out.println(li.equals(li1)); // this method use the equality of both list 
		//li.clear();
		//System.out.println(li);
		System.out.println(li.isEmpty());  //this method use the our array is empty to not with boolean out put ture or false
		System.out.println(li.contains("Ganesh")); // this method use the element present in list or not with boolean out put true or false
		System.out.println(li.get(5)); // this method use the which element is present in mentioned index we will show in our console
		System.out.println(li.element()); // this method use to starting element of our list it will be show in our console
		System.out.println(li.getFirst()); // this method use to starting element of our list it will be show in our console
		System.out.println(li.getLast());  // this method use to last element of our list it will be show in our console
		System.out.println(li.indexOf("Ganesh")); // this method use to which index of our mentioned list
		System.out.println(li.lastIndexOf(null)); // this method use to last index of our list
		System.out.println(li.offer("Ganesh"));  // this method use to insert the element in our list in last
		System.out.println(li.offerFirst("Tanpure"));
		li.offerFirst("Yogesh"); // this method use to insert the new name in fornt of our list
		System.out.println(li);
		li.offerLast("Rani");  // this method use to insert the element in our list in last
		System.out.println(li);
		li.peek();
		System.out.println(li.peek()); // this method use to display the first element in our list
		li.peekFirst();
		System.out.println(li.peekFirst());  // this method use to display the first element in our list
		li.peekLast();
		System.out.println(li.peekLast());  // this method use to display the last element in our list
		li.poll();
		System.out.println(li);
		li.pollFirst();  // this method use to remove the first element in our list
		System.out.println(li);
		li.pollLast();   // this method use to remove the last element in our list
		System.out.println(li);
		li.pop();    // this method use to remove the first element in our list
		System.out.println(li);
		li.push("My Freiend");  // this method is use to insert the new element in our list
		System.out.println(li);
		li.remove(5);  // this method is use to remove the our mentioned no of index from our list
		System.out.println(li);
		li.set(4, "Shivraj");  // this method is use to insert the new element in mentioned index no.
		System.out.println(li.size()); // this method is use to display the size of our list
		
		System.out.println("==============forloop======================================");
		for(int i=0; i<=li.size()-1;i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("==============for each loop================================");
		for(Object ln:li)
		{
			System.out.println(ln);
		}
		
		System.out.println("==============iterator========================");
		      Iterator<Object> ls = li.iterator();
		      while(ls.hasNext())
		    		  {
		    	          System.out.println(ls.next());
		    		  }
		      System.out.println("==============list-iterator===================");
            ListIterator<Object> ln = li.listIterator();
            while(ln.hasNext())
            {
            	System.out.println(ln.next());
            }
		      
		      
		      
		      
		
		
		
		
		
		
		
		
		
		

	}

}
