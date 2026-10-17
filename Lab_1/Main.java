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
				System.out.println("x = "+((-1*b+D)/2*a)+" and x =  "+((-1*b-D)/2*a));
				break;
			case -1:
				System.out.println("The equation has no real roots");
				break;
			default:
				System.out.println("Something went wrong");
		}
	}

	//Q3
	static void findFactorial(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--){
			fact*=i;
		}
		System.out.println("Factorial is : "+fact);
	}

	//Q4
	static boolean isPrime(int num){
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	static void generatePrimeNumbers(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int N=sc.nextInt();
		System.out.println(N+" prime numbers are :  ");
		
		for(int i=2;;i++){
			if(isPrime(i)){
				System.out.print(i+" ");
				N--;
				if(N==0)
					break;
			}
		}
			
	}

	//Q5
	static void checkArmstrong(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int arm=sc.nextInt();
		int copy=arm;
		int sum=0;
		while(copy>0){
			int digit = copy%10;
			sum+=digit*digit*digit;
			copy/=10;
		}
		if(sum==arm){
			System.out.println(arm+" is an armstrong number.");
		}else{
			System.out.println(arm+" is NOT an armstrong number.");
		}
	}

	//Q6
	static void sumOfDigits(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int sum=0;
		while(num>0){
			sum+=num%10;
			num/=10;
		}	
		System.out.println("Sum of the digits of that number: "+sum);	
	}
	public static void main(String[] args){

		// System.out.println("Hello World");
		//1.largestOf3();
		//2.quadraticRoots();
		//3.findFactorial();
		//Helper Function Test-> System.out.println(isPrime(100)); isPrime checker
		//4.generatePrimeNumbers();
		//5.checkArmstrong();
		sumOfDigits();

	}
}