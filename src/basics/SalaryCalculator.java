package basics;

public class SalaryCalculator {
	public static void main(String[] args){
		//let's create a variable to define our career
		
		//Declare a variable 
		String career;
		System.out.println("Program is starting");
		
		//Define a variable
		career = "Software Developer";
		System.out.println("My career:" + career);
		
		//Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek*weeksPerYear*rate;
		
		//compute our annual salary
		//rate*hoursPerweek*weeksPerYear
		System.out.println("My salary as a " + career + " is $" + salary + " per annum");
	}
}
