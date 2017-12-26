import java.util.Scanner;

class HCF {
	public static void main(String[] args) {
		int N1,N2;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the two number which HCF you want");
		N1 = obj.nextInt();
		N2 = obj.nextInt();
		int k = N1-N2;
		int temp,r;
		if(k > 0){
			temp  = N1/N2;
			r = N1%N2;
			if(r==0)
			{
				System.out.println("HCF of given number is :"+N2);
				return ;
			}
		    while(r!=0){
		    	int z = temp/r;
		    	r = temp%r;
		    	temp = z ;
		    }
		}
        else 
        	{ 
            temp  = N2/N1;
			r = N2%N1;
			if(r==0)
			{
				System.out.println("HCF of given number is :"+N1);
				return ;
			}
		    while(r!=0){
		    	int z = temp/r;
		    	r = temp%r;
		    	temp = z ;
		    }
		}
		System.out.println("The HCF of given nunber is :"+temp);
	}
}