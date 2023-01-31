package jingjie;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);

			Fraction a = new Fraction(in.nextInt(), in.nextInt());

			Fraction b = new Fraction(in.nextInt(),in.nextInt());

			a.print();

			b.print();

			a.plus(b).print();

			a.multiply(b).plus(new Fraction(5,6)).print();

			a.print();

			b.print();

			in.close();

		}



	}
class Fraction{
	int a;
	int b;
	Fraction(int a,int b) {
		this.a=a;
		this.b=b;
	}
	void print() {
		if(a==b) {
			System.out.println(1);
		}else {
			int i;
			for(i=a;;i--) { //寻找两个数的最大公约数
				 if(a%i==0&&b%i==0) break;
			}  
			System.out.println(a/i+"/"+b/i);
		}
	}
	Double toDouble() {
		return (a+0.0)/(b+0.0);
	}
	Fraction plus(Fraction r) {
		int a=(this.a*r.b)+(r.a*this.b);
		int b=this.b*r.b;
		return new Fraction(a,b);
	}
	Fraction multiply(Fraction r) {
		int a=this.a*r.a;
		int b=this.b*r.b;
		return new Fraction(a,b);
	}
}