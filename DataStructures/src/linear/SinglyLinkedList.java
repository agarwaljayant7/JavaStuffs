package linear;

public class SinglyLinkedList {
	int data;
	double data1;
	static SinglyLinkedList next;
	
	SinglyLinkedList(int data, SinglyLinkedList next)
	{
		this.data=data;
		this.next=next;
	}
	SinglyLinkedList(double data, SinglyLinkedList next)
	{
		this.data1=data;
		this.next=next;
	}
	public String toString()
	{
		return data+""+SinglyLinkedList.next;
	}
	public static void main(String[] args)
	{	
		SinglyLinkedList sl1=new SinglyLinkedList(8.0,null);
		SinglyLinkedList sl=new SinglyLinkedList(5,sl1);
		System.out.println(sl);
	}
}
