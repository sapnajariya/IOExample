package java_IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader(new File("E:/javaio/New folder/demo.txt"));
		Scanner sc=new Scanner(fr);
		
		while(sc.hasNextLine()){
			//System.out.print(ch);
			//ch=fr.read();
			String str=sc.nextLine();
			System.out.print(str);
			
			
		}
	
fr.close();
	}

}
