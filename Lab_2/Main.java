import java.util.*;
public class Main{

	//Q1
	static void bubbleSort(){
		int[] arr={3,7,9,1,4,22,76,43,21,66,53,70,99};
		System.out.print("Array before sorting : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		//lets bubble sort
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++)
				if(arr[j+1]<arr[j]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		}
		System.out.println();
		System.out.print("Array AFTER sorting : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	//Q2
	static void insertEleIntoArray(){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		System.out.print("Array before inserting : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number and position(index based) where it should be added");
		int ele= sc.nextInt();
		int pos= sc.nextInt();
		int[] arr2= new int[arr.length+1];
		arr2[pos]=ele;
		for(int i=0;i<pos;i++){
			arr2[i]=arr[i];
		}
		for(int i=pos+1;i<arr2.length;i++){
			arr2[i]=arr[i-1];
		}
		System.out.print("Array AFTER inserting : ");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}

		int arr3[]= new int[arr.length];
		System.out.println();
		System.out.println("Which element(value) do you wanna remove");
		int del= sc.nextInt();
		int counter=0;
		for(int i=0;i<arr3.length;i++){
			if(arr2[i]==del){
				counter++;
			}
			arr3[i]=arr2[counter++];
		}
		System.out.println();
		System.out.print("Array AFTER deleting : ");
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}


	}

	public static void main(String[] args){
		//1.bubbleSort();
		insertEleIntoArray();

	}
}