package testprograms;

public class StackDemo {

	private int[] stack;
	private int top;
	private int size;
	
	public StackDemo()
	{
		top=-1;
		size=50;
		stack=new int[size];
	}
	
	public boolean push(int item)
	{
		if(!isFull())
		{
			top++;
			stack[top]=item;
			return true;
		}
		else
		return false;
		
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			return stack[top--];
		}
		else
		return -1;
		
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public boolean isFull()
	{
		return (top==stack.length-1);
	}
	
	public static void main(String[] args)
	{
		StackDemo stack=new StackDemo();
		if(!stack.isFull())
		{
			stack.push(2);stack.push(4);stack.push(6);stack.push(8);
			
		}
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
