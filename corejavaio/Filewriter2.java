package java_IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Filewriter2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
FileReader fr=new FileReader("E:/javaio/New folder/demo1.txt ");
Scanner sc=new Scanner(fr);
FileWriter fw=new FileWriter("E:/javaio/New folder/demo.txt ");
PrintWriter p=new PrintWriter(fw);
while(sc.hasNextLine())
{
	String str=sc.nextLine();
	System.out.println("hello"+" "+str);
}
fr.close();
fw.close();
p.close();
	
System.out.print("data write");
	}
}
