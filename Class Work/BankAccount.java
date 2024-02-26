class Bank
{
	private String name;
	private int accountNo;
	private double balance;
	
	public Bank(String name, int accountNo, double balance) 
	{
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	@Override
	public String toString() 
	{
		return "Bank [name=" + name + ", accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	@Override
	public boolean equals(Object object)
	{
		Bank object1 = (Bank) object;
		if(object1.name == this.name && object1.accountNo == this.accountNo  && object1.balance == this.balance)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}



public class BankAccount
{
	public static void main(String[] args) 
	{
		Bank b1 = new Bank("Bappi",123456,100000.00);
		Bank b2 = new Bank("Bappi",123456,100000.00);
		Bank b3 = new Bank("Akash",1234,1000.00);
	
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);
		
		
		
	}
}
