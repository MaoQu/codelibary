package size;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int BJT;
Scanner in=new Scanner(System.in);
BJT=in.nextInt();
if (BJT<800)
{
	System.out.println("UCT="+((BJT+2400-800)/100)+":"+(BJT+1600-((BJT+2400-800)/100)*100));
}
else if(BJT==800)
{
	System.out.println("UCT="+"00:00");
}
else if(BJT>800)
{
	if(BJT<900)
	{
		if(BJT>810)
		{
			System.out.println("UCT="+"00:"+(BJT-800));
		}
		else
		{
			System.out.println("UCT="+"00:0"+(BJT-800));
		}
	}
	else
	{
		System.out.println("UCT="+((BJT-800)/100)+":"+(BJT+1600-((BJT+2400-800)/100)*100));
	}
}
in.close();

	}

}
