package java_IO;

import java.io.File;
import java.io.IOException;

public class FIleCreation2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//file create in your select drive or folder
		////File f1=new File("E:/javaio/test.txt");
		//System.out.print(f1.mkdir());
		File f2=new File("E:/javaio/New folder/demo.txt");
		System.out.println(f2.createNewFile());
		System.out.print(f2.getName());
		
		
	}

}
