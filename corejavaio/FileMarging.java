package java_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMarging {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
PrintWriter pw=new PrintWriter("E:/javaio/New folder/demo3.txt");
//BufferedReader object for file1.txt
BufferedReader br = new BufferedReader(new FileReader("E:/javaio/New folder/demo.txt"));
  
String line = br.readLine();
  
// loop to copy each line of 
// file1.txt to  file3.txt
while (line != null)
{
    pw.println(line);
    line = br.readLine();
}
  
br = new BufferedReader(new FileReader("E:/javaio/New folder/demo1.txt"));
  
line = br.readLine();
  
// loop to copy each line of 
// file2.txt to  file3.txt
while(line != null)
{
    pw.println(line);
    line = br.readLine();
}
  
pw.flush();
  
// closing resources
br.close();
pw.close();
  
System.out.println("Merged file1.txt and file2.txt into file3.txt");
}
}