import java.util.*;

class BankAcc {
	private int accountNumber;
	private String name;
	private int balance;

	public BankAcc(int accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
	@Override
	public boolean equals(Object ob) {
		if (ob instanceof BankAcc) {
			BankAcc b = (BankAcc) ob;
			if (this.accountNumber == b.accountNumber) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "BankAcc [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}

public class BankAppl {

	static Object search_bankAcc(ArrayList<BankAcc> list, Object o) {
		if (list.contains(o)) {
			return o;
		} else {
			return null;
		}
	}
	
	static void mergeAccount(ArrayList<BankAcc> list,Object ob1)
	{
		if(list.equals(ob1))
		{
			
		}
	}

	public static void main(String[] args) {
		BankAcc b1 = new BankAcc(1234, "Customer1", 1000);
		BankAcc b2 = new BankAcc(1324, "Customer2", 2000);
		BankAcc b3 = new BankAcc(1432, "Customer3", 3000);
		BankAcc b4 = new BankAcc(1423, "Customer4", 5000);
		BankAcc b5 = new BankAcc(1234, "Customer1", 1000);

		ArrayList<BankAcc> list = new ArrayList<>();

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		BankAcc b1_1 = new BankAcc(1234, "Customer1", 1000);
		BankAcc x = (BankAcc) search_bankAcc(list, b1_1);

		System.out.println("Your Searched Acc: " + x);
		
		
		
	}

}
