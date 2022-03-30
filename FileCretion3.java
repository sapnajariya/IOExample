package java_IO;

import java.io.File;
import java.io.IOException;

public class FileCretion3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
File f=new File("E:/javaio/New folder/demo1.txt");
if(f.exists())
{
	System.out.println("your fine name is"+" "+f.getName());
}
else
{
	System.out.println("your fine name is"+" "+f.createNewFile());
	
}
//path Name
System.out.println("your fine name is"+" "+f.getAbsolutePath());
//access permission
System.out.println("Writable"+" "+f.canWrite());
System.out.println("Readable"+" "+f.canRead());

//check file or directory
System.out.println("is file?"+" "+f.isFile());
System.out.println(f.isDirectory());
	}

}
