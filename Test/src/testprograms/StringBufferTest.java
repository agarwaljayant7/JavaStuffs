package testprograms;

public class StringBufferTest {
	
	public static void main(String[] args)
	{
		/*StringBuffer buffer=new StringBuffer("Hello ");
		buffer.append("world");
		
		System.out.println(buffer);*/
		
		StringBuilder builder =new StringBuilder("Good Morning");
		builder.append(" ");
		builder.append("Dhoni");
		
		System.out.println(builder);
	}
	
}
