package linear;

public class InitNodeDisp {
	static int data=5;
	static double data1=25.0;
	static short shortData=(short)data;
	static String name="Everest";
	//public static void main(String[] args)
	{
		AnotherNode anotherNode=new AnotherNode(data1,null);
		InitNode front=new InitNode(data,anotherNode);
		//InitNode front=new InitNode(data,null);
		StringNode sNode=new StringNode(name,null);
		CharNode cNode=new CharNode('j',null);
		ShortNode shNode=new ShortNode(shortData,null);
		LongNode lNode=new LongNode((long)data, null);
		FloatNode fNode=new FloatNode((long)data, null);
		DoubleNode dNode=new DoubleNode((double)(long)data, null);
		System.out.println(front);
		/*System.out.println(sNode);
		System.out.println(cNode);
		System.out.println(shNode);
		System.out.println(lNode);
		System.out.println(fNode);
		System.out.println(dNode);*/
		//System.out.println(anotherNode);
	}
}
