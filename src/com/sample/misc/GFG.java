package com.sample.misc;

//Java program to demonstrate working of
//Iterator.remove() on an integer arraylist
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class GFG
{
 public static void main(String[] args)
 {
     List<Integer> al = new ArrayList<Integer>();
     al.add(1);
     al.add(2);        
     al.add(10);
     al.add(20);
     al.add(30);
        
     // Remove elements smaller than 10 using
     // Iterator.remove()
     Iterator<Integer> itr = al.listIterator(1);
     while (itr.hasNext())
     {
         int x = (Integer)itr.next();
         if (x >= 10)
         itr.remove();
     }

     System.out.println("Modified ArrayList : "+ al);
 }
}
