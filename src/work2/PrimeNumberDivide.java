package work2;

public class PrimeNumberDivide {
	public static void main(String[] args) {
	int a ;
		for(a = 1 ; a <= 100 ; a++) {
			
			if(a % 3== 0  &&  a % 5==0)
				System.out.println("FizzBuzz");
			else if( a % 3 == 0) {
					System.out.println("fizz");
			}else if (a % 5 == 0) {
					System.out.println("Buzz");
				}else {
					System.out.println(a);
				}
			}
		}
	
}


