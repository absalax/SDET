package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String booktitle = "Lord of the rings";
		String wordchoice = "Ring";
		if 
		(booktitle.contains("ring"));{
			System.out.println ("the title contains ring");
		}
			if 
			(booktitle.contains(wordchoice));{
				System.out.println ("the title contains ring again");
		}
		
		String browser = "chrome";
		if (browser.equalsIgnoreCase("Chrome"));
		System.out.println("the browser is chrome");
		
		String firstname = "Abi";
		String lastname = "Salau";
		String SSN = "012345678";
		
		System.out.println("there are "+ SSN.length()+ " digits in your SSN");
		
		System.out.print(firstname.substring(0,1));
		System.out.print(lastname.substring(0,1));
		System.out.println(SSN.substring(5,9));
		
		
	}
	
		
		
		
	
}
