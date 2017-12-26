import java.util.Scanner;

class fibonacci {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no. of term that you want.");
		int N = obj.nextInt();
		int t1,t2;
		t1 = 1;
		t2 = 1;
		if(N==1||N==2)
		{
			System.out.println(1);
			return ;
		}
		int sum = 0;
		for(int i =2;i<N;i++){
			sum = t1+t2;
			t1 = t2;
			t2 = sum;
		}
		System.out.println(sum);

	}
}		