package exceptiondemo;

public class demo5 {

	public static void main(String[] args) {
		float a=10f;
		int b=0;
		try
		{
			float result=a/b;
			System.out.print(result);
		}
		catch(Exception e)
		{
			e.getMessage();
		}

	}

}
