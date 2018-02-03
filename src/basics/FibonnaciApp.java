package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibonnaci is the sum of the first two fibonnaci numbers
		//f(0)=0
		//f(1)=1
		//f(2)= 0 + 1=1
		//f(3)= 1+1 =2
		
	System.out.println(fib(4));	
		
	}
//recursion
	public static int fib(int n){
		if (n==0){
		
		return 0;
		}
		else if (n==1){
			return 1;
		}
		
		return (((fib(n-1))+ (fib(n-2))) );
		}
	
}
