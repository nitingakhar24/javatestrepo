package com.sample.datastructures;

public class MyStack 
{
	private int maxSize;
	private String[] arr;
	private int top;
	
	public MyStack(int size) 
	{
		maxSize = size;
		arr = new String[maxSize];
		top = -1;
	}
	
	public void push(String element)
	{
		arr[++top] = element;
	}
	
	public String pop()
	{
		return arr[top--];
	}
	
	public String peek()
	{
		return arr[top];
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isFull()
	{
		return (top == maxSize -1);
	}
	
	 public static void main(String[] args) {
	      MyStack theStack = new MyStack(10); 
	      theStack.push("Z");
	      theStack.push("Y");
	      theStack.push("X");
	      theStack.push("W");
	      theStack.push("V");
	      
	      while (!theStack.isEmpty()) {
	         String value = theStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	   }
	
}
