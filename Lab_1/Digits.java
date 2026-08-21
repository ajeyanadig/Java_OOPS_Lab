import java.util.Scanner;
class Digits{
	public static void main(String[] args){
		int sum=0;
		int digit=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number you want to find out sum of digits : ");
		int num= sc.nextInt();
		int copy=num;
		while(num>0){
			digit= num%10;
			sum+=digit;
			num/=10;
		}
		System.out.println("Sum of digits in "+copy+" is : "+sum);


	}
}