package size;

import java.util.Scanner;

public class sushuhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int x=0;
		int sum=0;
		for(int n=2;n<200;n++)
		{
			int isPrime=1;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isPrime=0;		
					break;
				}
			}
			if(isPrime==1)
			{
				x=x+1;
//				System.out.print(x+" ");
				if(x>=a)
				{
					if(x<=b)
					{
						sum+=n;
					}
				}
//				System.out.print(n+" ");
			}else
			{
			}
		}
			System.out.print(sum);
	}
}
