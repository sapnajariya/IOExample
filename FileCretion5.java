package java_IO;

import java.io.File;
import java.io.IOException;

public class FileCretion5 {

	public static void main(String[] args) throws IOException{
		File f=new File("E:/javaio/Test1.pptx");
		System.out.println(f.createNewFile());

	}

}
