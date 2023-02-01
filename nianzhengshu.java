package size;

import java.util.Scanner;

public class nianzhengshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
        int m=in.nextInt();
        int t=1;
        if(m>=-100000&&m<=100000) 
        {
            if(m<0) 
            {
                System.out.print("fu ");
                m=-m;
            }
            int x=m;
//            用来计算输入数字的位数
            while(x>9) 
            {
                x/=10;
                t*=10;
            }
            do
            {
                switch(m/t) 
                {
                    case 1:
                        System.out.print("yi");break;
                    case 2:
                        System.out.print("er");break;
                    case 3:
                        System.out.print("san");break;
                    case 4:
                        System.out.print("si");break;
                    case 5:
                        System.out.print("wu");break;
                    case 6:
                        System.out.print("liu");break;
                    case 7:
                        System.out.print("qi");break;
                    case 8:
                        System.out.print("ba");break;
                    case 9:
                        System.out.print("jiu");break;
                    case 0:
                    System.out.print("ling");break;
                }
                if(t>9) 
                {
                    System.out.print(" ");
                }
                m=m%t;
                System.out.println(m);
                t/=10;
            }while(t>0);
            
        }
	}

}
