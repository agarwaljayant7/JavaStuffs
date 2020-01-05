package linear;

class StringNode {
	String name;
	StringNode next=null;
	
	StringNode(String name,StringNode next)
	{
		this.name=name;
		this.next=next;
	}
	public String toString()
	{
		return name+next;
	}
	
}
