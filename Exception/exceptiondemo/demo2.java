package exceptiondemo;

public class demo2 {

	public static void main(String[] args) {
		String str="";
		String str1=null;
		//String str1="sapna";
		try
		{
			System.out.println(str.charAt(4));
			//System.out.println(str.compareTo(str1));
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.print( "String is small");
			
		}
		catch( RuntimeException e)
		{
			e.printStackTrace();
			//System.out.print("\nchild catch");
		}
		catch( Exception e)
		
		{
			e.printStackTrace();
			System.out.print( e+" "+"Generic Catch");
		}

	}

}
