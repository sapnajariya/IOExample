package java_IO;

import java.io.File;
import java.io.IOException;

public class FileCreation6 {

	public static void main(String[] args) throws IOException {
		File directory=new File("E:/javaio");
		String []s=directory.list();
		for(String s1:s)
		{
System.out.println(s1);
		}
		File subDir=new File(directory,"test");
		System.out.println(subDir.mkdir());
	}

}
