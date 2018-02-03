package oop;

public class BankAccount {
	//define properties
	String accNumber;
	//static belongs to the class not the object
	//final is a constant
	static final String routingNumber = "12345";
	String name;
	String ssn;
	String accountType;
	
	//constructor definitions: unique methods
	//1. They are used to define/setup/initialize properties of an object
	//2. Constructors are IMPLICITLY called upon instantiation
	//3. The same name as the class itself
	//4. Constructors have NO return type
	
	BankAccount(){
		System.out.println("new account created");
	}
	
	//overloading constructors --same method, different argument
	BankAccount(String accNumber){
		System.out.println(accNumber + " account number added");
	
	}
	
	BankAccount (String accountType, double initDeposit){
		System.out.println(accountType);
		System.out.println("INITIAL DEPOSIT $"+initDeposit);
	}
	
	//define methods
	public void deposit(double amount){
		
	}
	
	void withdraw(){
		
	}
	
	void checkBalance(){
		
	}
	
	void getStatus(){
		
	}
	
}
