import java.util.Scanner;

class fact {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int N = obj.nextInt();
		int factorial = 1;
		while(N>0){
			factorial *=  N;
			N--;
		}
		System.out.println("Factorial of the given no. is : "+factorial);

	}
}