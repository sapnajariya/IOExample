package java_IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterexam {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
FileWriter fw=new FileWriter("E:/javaio/New folder/demo1.txt");
PrintWriter pw=new PrintWriter (fw);
for(int i=1;i<5;i++)
{
	pw.println("hello Tejal");
}
fw.close();
pw.close();
	}

}
