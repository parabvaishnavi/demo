package demo;


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(112299,"sudesh teli",10000);
		BankAccount newaccount = new BankAccount(112300,"Ashitosh Dessai",10000);
		SavingBankAccount sb=new SavingBankAccount(111111,"Rahul Rane",10000);
		
		System.out.println("The customer account no. is "+account.getAccountnumber());
		System.out.println("The customer name is "+account.getCustomername());
		System.out.println("The customer account balance is "+account.getBalance());
		
		account.setDeposit(1000,account);
		System.out.println("The customer "+ account.getCustomername()+" has balance "+account.getBalance()+" after depositing rs."+1000);
		
		account.setWithdraw(1000,account);
		System.out.println("The customer "+ account.getCustomername()+" has balance "+account.getBalance());
	
		account.Transfer(account,newaccount,2000);
		
		System.out.println("The senders balance is "+account.getBalance());
		System.out.println("The receivers balance is "+newaccount.getBalance());
		
		BankAccount b= new BankAccount(112666,"Diptesh teli",100000);

		SavingBankAccount s = new SavingBankAccount(111222,"Rahul Mane",110000);

		CurrentAccount a = new CurrentAccount(191919,"Karan Dhawaskar",100000);
		b.Deposit(1000); 

		b.Withdraw(2000);

		s.Deposit(2000);

		s.Withdraw(2000);

		s.calculateinterest();
		sb.calculateinterest();
		
		a.overdraft(100000);
		a.overdraft(5000);
		a.Withdraw(5000);
		
		//Here we are actually using polymorphism from bank account to saving or current account
		b=a;
		b=s;
		//type mismatch cannot convert from BankAccount to Current Account 
		//a=b;
		//type mismatch cannot convert from BankAccount to Saving Account 
		//s=b;
		////type mismatch cannot convert from SavingBankAccount to Current Account 
		//a=s;
		////type mismatch cannot convert from Current Account to SavingBankAccount  
		//s=a;
	}
	}