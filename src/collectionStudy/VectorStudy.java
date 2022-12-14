package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy 
{

	public static void main(String[] args) 
	{
		Vector<Integer> b= new Vector<>();
		b.add(25);
		b.add(null);
		b.add(null);
		b.add(null);
		b.add(20);
		b.add(25);
		b.add(100);
		b.add(58);
		System.out.println(b);
	     b.add(999);
	     System.out.println(b);
	     b.add(3, 888);
	     System.out.println(b);
	     System.out.println(b.capacity());
	     System.out.println(b.size());
	     b.add(777);
	     b.add(555);
	     b.add(666);
	     System.out.println(b.capacity());
	     System.out.println(b.size());
	     b.clone();
	     System.out.println(b);
	    // b.clear();
	     //System.out.println(b);
	     
	     System.out.println(b.contains("Priyanka"));
	     System.out.println(b.contains(25));
	     System.out.println(b.indexOf(null));
	     System.out.println(b.lastIndexOf(null));
	     System.out.println(b.get(8));
	     System.out.println(b.isEmpty());
	    
	   System.out.println("========================forloop==============================");
	   
	   for(int i=0; i<=b.size()-1;i++)
	   {
		   System.out.println(b.get(i));
	   }
	   System.out.println("========================for each loop==============================");
	   for(Integer c:b)
	   {
		   System.out.println(c);
	   }
	   System.out.println("========================iterator==============================");
	   Iterator<Integer> d = b.iterator();
	   while(d.hasNext())
	   {
		   System.out.println(d.next());
	   }
	   System.out.println("========================List-iterator==============================");
	   ListIterator<Integer> c = b.listIterator();
	   while(c.hasNext())
	   {
		   System.out.println(c.next());
	   }
	   System.out.println("========================Enumeration==============================");
	   Enumeration<Integer> be = b.elements();
	   while(be.hasMoreElements())
	   {
		   System.out.println(be.nextElement());
	   }
	   
	   
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
		
	}

}
