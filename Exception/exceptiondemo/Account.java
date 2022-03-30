package exceptiondemo;

public class Account {
	 private String number;
	 private String accountType;
	 private Double balance;
	private String getNumber() {
		return number;
	}
	private void setNumber(String number) {
		this.number = number;
	}
	private String getAccountType() {
		return accountType;
	}
	private void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	private Double getBalance() {
		return balance;
	}
	public void deposit()
	{
		System.out.print(" I want to deposite ");
	}
	public void withdrawal( int amt)
	{
		try
		{
			balance=balance-amt;
			System.out.print("remaining amt="+" "+balance);
		}
		catch(Exception e)
		{
			System.out.print("Insufficient balance");
		}
	}
	public void foundTransfer()
	{
		
	}
	public void payBilss()
	{
		
	}
	 

}
