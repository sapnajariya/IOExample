package java_IO;

import java.io.File;
import java.io.IOException;

public class FileRename {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File f=new File("E:/javaio/demo.txt");
		System.out.print(f.renameTo(new File("E:/javaio/demo.txt")));
		//file delete
		f.delete();
		File f1=new File("E:/javaio/test.txt");
		f1.deleteOnExit();

	}

}
