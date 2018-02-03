package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walking(){
		System.out.println(name + " is sleeping");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(phone + " number to call");
	}
	
	
}

public class Demo {

	public static void main(String[] args) {
		//instantiating an object
		Person Person1 = new Person();
		
		//define some properties
		Person1.name = "Joe";
		Person1.email = "Joebloggs@yahoo.com";
		Person1.phone = "01224337684";
		
		//Abstraction
		Person1.eat();
		Person1.walking();
		
		///
		
		Person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.walking();
		
		/*
		
		//person
		
		//atrributes,variables,adjectives,descriptors
		String name = "Joe";
		String email = "Joeblogs@hotmail.com";
		String phone = "01224336595";
		
		//Action, activity,behaviour
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		//what if we wanted to do this for another person
		String name2 = "Sarah";
		String email2 = "Sarahblogs@hotmail.com";
		String phone2 = "01184336595";
		
		//Action, activity,behaviour
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		//what about binding attributes and properties together?
		
	}
	
		//Enhance by adding functions to minimize code
		static void walking (String name){
			System.out.println(name + " is walking");
			
			*/
		}

}
