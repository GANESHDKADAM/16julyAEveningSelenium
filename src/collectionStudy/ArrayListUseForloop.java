package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListUseForloop 
{

	public static void main(String[] args) 
	{

     ArrayList<Object> al= new ArrayList<>();
    al.add("Ganesh");
    al.add('M');
    al.add("Ganesh");
    al.add(20.50f);
    al.add(null);
    al.add(null);
    al.add(null);
    al.add(25);
    al.add("Aurangabad");
    
    System.out.println(al);
    
    al.add(1, "Rajesh");
    System.out.println(al);
    Object a = al.clone();
    
    System.out.println(a);
    //al.clear();
  //  System.out.println(al);
    System.out.println(al.contains("Ganesh"));
    System.out.println(al.get(5));
    
    
    System.out.println("===========forloop==============");
    
    for(int i=0; i<=al.size()-1;i++)
    {
    	System.out.println(al.get(i));
    }
    
    System.out.println("===========for each loop==============");
    for(Object c:al)
    {
    	System.out.println(c);
    }
    System.out.println("===========iterator==============");
    
    Iterator<Object> b = al.iterator();
    while(b.hasNext())
    {
    	System.out.println(b.next());
    }
    System.out.println("===========List-iterator==============");
    
    ListIterator<Object> d = al.listIterator();
    while(d.hasNext())
    {
    	System.out.println(d.next());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	}

}
