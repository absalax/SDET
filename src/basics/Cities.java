package basics;

public class Cities {
	public static void main (String[] args){
		//declare and define an array implicitly defining the size
		String[] cities = {"new york","london","aberdeen"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		
		System.out.println("***************");
		
		//declare an array
		String[] borough;
		borough = new String[3];
		borough[0] = "wokingham"; 
		borough[1] = "west berks";
		borough[2] = "reading";
		
		System.out.println(borough[2]);
		System.out.println(borough[0]);
		System.out.println(borough[1]);
		
		System.out.println("***************");
		
		//declare and define an array -explicitly defining the size
		String[] countries = new String[5];
		countries[0] = "uk";
		countries[1] = "usa";
		countries[2] = "canada";
		countries[3] = "france";
		countries[4] = "belgium";
		
		int i;
		i = 0;
		
		//DO loop: enters the loop then tests condition
		do {System.out.println ("country: " +countries[i]);
		i=i+1;
		}
		while(i<5);
		
		//WHILE LOOP: tests condition then enters loop example 1
				//int i;
				//i= 0;
				
				//while (i<5){
					
					//System.out.println("country at " +n + ": " + countries[n]);
					//n++;
		
		//WHILE LOOP: tests condition then enters loop example 2....couldnt get this to work
		int n=0;
		boolean countryfound = false;
		while (!countryfound){
			String country = countries[n];
			System.out.println(country);
		
			if (country == "canada");{
			System.out.println("COUNTRY FOUND " +country );
			countryfound = true;
				}
		n++;
		}
		System.out.println("printing with for loop");
		//For loop: best structure for iterating through an array
	
		int x;
		for (x =0; x<3; x++);{
			
			System.out.println(countries[x]);
		}
	}
}
