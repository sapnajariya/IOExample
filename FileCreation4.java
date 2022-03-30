package java_IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileCreation4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f=new File("E:/javaio/demo1.txt");
		FileWriter fw=new FileWriter(f);
		
		for(int i=1;i<5;i++)
		{
			fw.write("hello sapna");
		}
		fw.flush();//cleaan buffer
		fw.close();
		System.out.print("Data saved");
		System.out.println(f.length());
		System.out.print(new Date(f.lastModified()));
		
	}

}
