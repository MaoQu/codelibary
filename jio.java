package size;

import java.util.Scanner;

public class jio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x;
		int n;
		int sum;
		int cun=0;
		int max;
		int nax;
		int nux=0;
		int fin=0;
		double a;
		x=in.nextInt();
		do
		{
			n=x/10;
			sum=x-n*10;
			cun=cun+1;
			max=sum%2;
			nax=cun%2;
			if(max==nax)
			{
//				System.out.println("1");
				a=Math.pow(2, nux);	
//				System.out.println(a);
				fin=(int) (fin+a);
			}
			x=x/10;
			nux=nux+1;
		}while(x>0);
		System.out.println(fin);
		
	}

}
