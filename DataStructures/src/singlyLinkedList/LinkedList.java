package singlyLinkedList;

 class LinkedList {
	
	Node head;
	Node node;
	public void insert(int data)
	{
		node=new Node();
		node.data=data;
		node.link=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			head=head.link;
			while(head.link!=null)
			{
				head.link=node;
			}
			head.link=null;
		}
	}
	
	public void show()
	{
		while(head.link!=null)
		{
			System.out.println(head.data);
		}
	}
}
