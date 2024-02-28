package java;


import java.util.*;

abstract class Account {
    private int accNo;
    private double balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract void deposite();

    abstract void withdrawl();
}

class SavingAccount extends Account {
    private double interest;

    Scanner in = new Scanner(System.in);

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    void deposite() {
        double amount = (getBalance() * interest) / 100;
        System.out.println("Your interest is :" + amount);
    }

    @Override
    void withdrawl() {
        System.out.print("Enter the amount you want to withdraw: ");
        double amt = in.nextDouble();

        if (amt > getBalance()) {
            System.out.println("not Enough Balance");
        } else {
            System.out.println("Money Withdrawl RS: " + amt);
            setBalance(getBalance() - amt);
            System.out.println("Your current Balance is + " + getBalance());
        }
    }

}

class CurrentAccount extends Account {
    private double overDraft;
    Scanner in = new Scanner(System.in);

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    @Override
    void deposite() {
        System.out.print("Enter the amount you want to deposite: ");
        double amt = in.nextDouble();
        setBalance(getBalance() + amt);
        System.out.println(" Money Deposited:");

    }

    @Override
    void withdrawl() {

        System.out.print("Enter the amount you want to withdraw: ");
        double amt = in.nextDouble();

        if (amt > getOverDraft()) {
            System.out.println("Out of Limit");
        } else {
            System.out.println("Money Withdrawl RS: " + amt);
            setBalance(getBalance() - amt);
            System.out.println("Your current Balance is + " + getBalance());
        }

    }

}

public class BankApplication{
    public static void main(String args[]) {
        SavingAccount sa = new SavingAccount();
        CurrentAccount ca = new CurrentAccount();
        sa.setBalance(2000);
        sa.setInterest(10);
        sa.deposite();

        ca.setBalance(1000);

    }

}