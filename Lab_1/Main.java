import java.util.*;
public class Main{
	//Q1
	static void largestOf3(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();

		if(a>b){
			if(a>c){
				System.out.println(a+" is the largest of the 3 numbers");
			}
			else{
				System.out.println(c+" is the largest of the 3 numbers");
			}
		}else{
			if(b>c){
				System.out.println(b+" is the largest of the 3 numbers");
			}
			else{
				System.out.println(c+" is the largest of the 3 numbers");
			}
		}
	}

	//Q2
	static void quadraticRoots(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a,b,c for expression - ax^2 + bx + c");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int D= b*b- 4*a*c;
		int flag=0;
		if(D>0)
			flag=1;
		if(D<0)
			flag=-1;
		if(D==0)
			flag=0;
		switch(flag){
			case 0: 
				System.out.println("The equation has one root i.e. x = "+(-1*b/2*a));
				break;
			case 1:
				System.out.println("The equation has two roots which are");
				System.out.println("x = "+((-1*b+D)/2*a)+" and x = "+((-1*b-D)/2*a));
				break;
			case -1:
				System.out.println("The equation has no real roots");
				break;
			default:
				System.out.println("Something went wrong");
		}
	}
	public static void main(String[] args){
		// System.out.println("Hello World");
		//largestOf3();
		quadraticRoots();

	}
}