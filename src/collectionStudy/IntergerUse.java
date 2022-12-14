package collectionStudy;

import java.util.ArrayList;

public class IntergerUse 
{

	public static void main(String[] args) 
	{

      ArrayList<Integer> g1= new ArrayList<>();
      g1.add(10);
      g1.add(50);
      g1.add(70);
      g1.add(10);
      g1.add(null);
      g1.add(null);
      g1.add(80);
      g1.add(100);
      
      System.out.println(g1);
      Object g2 = g1.clone();
      System.out.println(g1.equals(g2));
      System.out.println(g2);
      System.out.println(g1.contains(null));
      System.out.println(g1.indexOf(50));
      //g1.clear();
      System.out.println(g1.isEmpty());
      System.out.println(g1.lastIndexOf(50));
      System.out.println(g1.remove(2));
      System.out.println(g1);
      System.out.println(g1.size());
      System.out.println(g1.toString());
      System.out.println(g1.get(5));
      System.out.println(g1);
      System.out.println(g1.remove(4));
      System.out.println(g1); 
      System.out.println(g1.set(3,4));
      System.out.println(g1);
      
      
      

	}

}
