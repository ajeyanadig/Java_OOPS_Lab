import java.util.Scanner;
class Prime{
	public static void main(String[] args){
		System.out.println("Enter a number(greater than 1) to check if its prime or not");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println(num+" is a prime number");
		}
		else{
			System.out.println(num+" is not a prime number");
		}
	}
}