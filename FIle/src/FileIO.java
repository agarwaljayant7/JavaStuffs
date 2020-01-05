import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		
		/*File f=new File("Abc.xlsx");
		
		//f.mkdir();
		
		f.createNewFile();
		File f1=new File("Def.xlsx");
		f1.createNewFile();
		
		//f.delete();
		System.out.println(f.exists()+" "+ f1.exists());
		
		//System.out.println(f.getAbsolutePath());
		
		File f2=new File("/Users/jayantagarwal/eclipse-workspace/FIle");
		
		String[] s=null;
		s=f2.list();
		int count = 0;
		for(String s1: s)
		{
			File f3=new File(f2,s1);
			if(f3.isDirectory())
			{
			count++;
			System.out.println(s1);
			}
			
		}
		System.out.println(count);
		
		File f3=new File("Abc.txt");
		//f3.delete();
		f3.createNewFile();
		FileWriter fw=new FileWriter(f3);
		//fw.write(90);
		//char[] cbuf= {'a','b','\n','c','d','e'};
		
		String str="A quick brown fox jumps over a lazy dog";
		//fw.write(cbuf);
		//fw.write(st);
		//fw.write(cbuf, 0, 1);
		fw.write(str, 7, 6);
		
		System.out.println("DATA writing operation completes");
		fw.flush();
		fw.close();*/
		
		File f4=new File("Jharkhand.txt");
		f4.createNewFile();
		/*FileWriter fw1=new FileWriter(f4);
		fw1.write("A quick brown fox jumps over a lazy dog");
		fw1.close();
		
		FileReader fr=new FileReader(f4);
		int i=fr.read();
		System.out.println(i);
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}*/
		
		FileWriter fw=new FileWriter(f4,true);
		
		//char[] ch=new char[30];
		/*for(int i=65;i<ch.length;i++)
		{
			ch[i]=(char)i;
		
		}
		
		fw.write(ch,0,26);*/
		fw.close();
		
		FileReader fr1=new FileReader(f4);
		long len=f4.length();
		char[] cbuf=new char[(int)len];
		
		int i1=fr1.read(cbuf);
		System.out.println("Printing i1="+i1);
		fr1.close();
		
		fr1=new FileReader(f4);
		int i=fr1.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			//System.out.print((char)fr1.read());
			i=fr1.read();
			
		}
		fr1.close();
		/*try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
		}*/
		//FileReader fr=new FileReader();
		
		
		

	}

}
