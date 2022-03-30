package java_IO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Fileread {

	public static void main(String[] args)throws IOException {
		File f=new File("E:/javaio/demo3.txt");
		PrintWriter pw=new PrintWriter(f);
		for(int i=1;i<=5;i++)
		{
			pw.write("hello World");
		}
pw.close();
	}

}
