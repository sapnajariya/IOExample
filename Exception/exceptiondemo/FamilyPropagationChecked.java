package exceptiondemo;

public class FamilyPropagationChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//handle MistakeException
		dad();
	}
		public static void dad()
		{
			try{
				mom();
			}
			catch(MistakeException e)
			{
				System.out.print(e.getMessage());
			}
		}
		public static void mom() throws MistakeException
		{
			son();
		}
		public static void son()throws MistakeException
		{
			MistakeException me=new MistakeException();
			throw me;
		}
	

}

