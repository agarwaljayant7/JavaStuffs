package testprograms;

public class PerformaneTest {

	public static void  main(String[] args)
	{
		long starttime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<10000000;i++)
		{
			sb.append("Jayant");sb.append(" ");sb.append("agarwal");
		}
		
		System.out.println("Time taken by String buffer "+ (System.currentTimeMillis() - starttime)+"ms");
		
		
		
		long starttime1=System.currentTimeMillis();
		
		StringBuilder sbl=new StringBuilder();
		for(int i=0;i<10000000;i++)
		{
			sb.append("Jayant");sb.append(" ");sb.append("agarwal");
		}
		
		System.out.println("Time taken by StringBuilder "+(System.currentTimeMillis()-starttime1)+"ms");
	}
}
