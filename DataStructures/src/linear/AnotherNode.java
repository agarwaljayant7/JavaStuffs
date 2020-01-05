package linear;

public class AnotherNode {
	Double d;
	AnotherNode an;
	
	AnotherNode(Double d,AnotherNode next )
	{
		this.d=d;
		this.an=next;
	}
	public String toString()
	{
		return d+""+an;
	}
}
