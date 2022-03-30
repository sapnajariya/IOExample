package java_IO;

import java.io.File;

public class FileCreation1 {

	public static void main(String[] args) {
	//file create in current dir	
	File f=new File("batch3");
System.out.print(f.mkdir());
	}

}
