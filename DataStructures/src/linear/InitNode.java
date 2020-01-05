package linear;

 class InitNode {
	int data;
	AnotherNode next;
	InitNode(int data,AnotherNode next)
	{
		this.data=data;
		this.next=next;
	}
	public String toString()
	{
		return data+" "+next;
	}

}
