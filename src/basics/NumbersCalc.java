package basics;

public class NumbersCalc {
	public static void main(String[] args){
		System.out.println("Program is starting");
		printname();
		int numA = 30;
		int numB = 20;	
		addnumbers(numA, numB);
		multiplynumbers(numA,numB);
		int newproduct = multiplynum(numA, numB);
		addnumbers(newproduct, numB);
		printend();
		
		
	}
	static void printname(){
		System.out.println("My name is Abi");
	}
	static void addnumbers(int numberA,int numberB){
	int sum = (numberA + numberB);
	System.out.println("the sum of A and B =" + sum);
	}
	
	static void multiplynumbers(int numberA,int numberB){
		int product = numberA * numberB;
		System.out.println("the product of A and B =" + product);
		
	}
	
	static int multiplynum (int valueA, int valueB){
		
		int newproduct = (valueA * valueB);
		
		return newproduct;
		
	}
	
		static void printend(){
	System.out.println("Program ends here");
	}
}
