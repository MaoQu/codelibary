package size;

import java.util.Scanner;

public class caishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=(int)(Math.random()*100+1);
		int number;
		int count=0;
		do
		{
			number=in.nextInt();
			count=count+1;
			if (number<a)
			{
				System.out.println("Small");
			}
			else
			{
				System.out.println("Big");
			}
		}while (number!=a);
		System.out.println("Good job,You guessed "+count+" times!");
	}

}
