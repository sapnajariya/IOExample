package exceptiondemo;

public class ExDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int i=10,j=0;
		double result=i/j;
		//System.out.print(result);
		}
		catch ( Exception e){
		System.out.print(e.getMessage()+""+"\tyou are tring to divide by zero");
				
		}
	
	}

}
