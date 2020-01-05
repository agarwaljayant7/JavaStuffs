package com.jms.demo;

import java.util.Scanner;

public class Node {

	int data;
	static Node link;
	
	public String toString()
	{
		return data+""+link;
	}
	
	public static void main(String[] args)
	{
		/*Node node=new Node();
		node.data=5;
		node.link=null;
		
		//System.out.println(node);
		
		Node node1=new Node();
		node1.data=10;
		node1.link=null;
		
		node.link=node1;
		
		//System.out.println(node.data+"->"+node.link);
		
		Node node2=new Node();
		node2.data=20;
		node2.link=null;
		node.link.link=node2;
		
		System.out.println(node.data+"->"+node.link.data+"->"+node.link.link);*/
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Input the value: ");
			int data=(Integer.parseInt(sc.nextLine()));
			//System.out.println(data);
			insert(data);
		}
	}
	
	public static void insert(int data)
	{
		Node n=new Node();
		if(n.link==null)
		{
			
		}
		else
		{
		n.data=data;
		n.link=null;
		}
		
	}
}
