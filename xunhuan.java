package size;

import java.util.Scanner;

public class xunhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
		 int x;
		 int number=0;
		 int sum=0;
		 x=in.nextInt();
		 while(x!=-1)
		 {
			 if(x%2==1)
			 {
				 number=number+1;
//				 System.out.println(number);
			 }else
			 {
				 sum=sum+1;
			 }
			 x=in.nextInt();
		 }
		 System.out.println(number);
		 System.out.println(sum);
	}

}
