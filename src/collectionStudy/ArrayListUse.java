package collectionStudy;

import java.util.ArrayList;

public class ArrayListUse 
{

	public static void main(String[] args) 
	
	{
		ArrayList<Object>al=new ArrayList<>();
		al.add("Ganesh");
		al.add('M');
		al.add(25);
		al.add(20.50f);
		al.add("Ganesh");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add("aurangabad");
		
		System.out.println(al);
		al.add(4, "Gopika");
		System.out.println(al);
		
		//al.clear();
		//System.out.println(al);
		
		Object al1 = al.clone();
		System.out.println(al1);
		System.out.println(al.equals(al1));
		al.get(2);
		System.out.println(al.get(5));
		System.out.println(al.contains("Aarav"));
		System.out.println(al.contains("Ganesh"));
		System.out.println(al.indexOf(null));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf(null));
		System.out.println(al.remove(6));
		System.out.println(al);
		System.out.println(al.remove("Ganesh"));
		System.out.println(al);
		System.out.println(al.set(7, "RaviRaj"));
		System.out.println(al);
		System.out.println(al.size());
	    al.clear();
	    System.out.println(al);
	    
		
		
		
		
		

	}


	}


